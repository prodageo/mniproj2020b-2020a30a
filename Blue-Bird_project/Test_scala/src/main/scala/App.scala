import org.apache.spark.sql.functions._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.{BooleanType, IntegerType, LongType, StringType, StructField, StructType}
import org.apache.spark.sql.Encoders

import scala.io.Source

object App{
  var word_to_subj = collection.mutable.Map[String, String]()
  var word_to_pol = collection.mutable.Map[String, String]()
  val bufferedSource = Source.fromFile("dictionary.tsv")
  for (line <- bufferedSource.getLines) {
    val cols = line.split("\t").map(_.trim)
    word_to_subj += (s"${cols(2)}" -> s"${cols(0)}")
    word_to_pol += (s"${cols(2)}" -> s"${cols(5)}")
    //println(s"${cols(0)}|${cols(2)}|${cols(5)}")
  }
  def get_polarity(word : String):Integer={
    //val a = dict(word)
    if (word_to_subj.contains(word)){
      var subj_word = word_to_subj(word)
      var polarity = word_to_pol(word)
      if (subj_word=="weaksubj"){
        if (polarity=="negative"){
          return -1
        };if (polarity=="positive"){
          return 1
        }
        return 0
      };
      if (subj_word=="strongsubj"){
        if (polarity=="positive"){
          return 2
        };if (polarity=="negative"){
          return -2
        }
        return 0
      }
    }
    return 0
  }

  def process_polarity(text: String):Integer={
    var sum = 0
    var words = text
      .toLowerCase()
      .replaceAll("'|-|:|\\.|,|!|#|\\?", " ")
      .split(' ')
      .foreach(sum+=get_polarity(_))
    return sum
  }

  def process_polarity_per_word(text: String):String={
    return text
      .toLowerCase()
      //.replace("'|-|:|.|,|!", " ")
      .replaceAll("'|-|:|\\.|,|!|#|\\?", " ")
      .split(' ')
      .map(get_polarity)
      .mkString("+")
  }

  def main(args: Array[String]): Unit = {
    System.setProperty("hadoop.home.dir", "C:\\winutils")

    val spark = SparkSession.builder()
      .master("local[3]")
      .appName("SparkByExample")
      .getOrCreate()
    import spark.implicits._

    spark.sparkContext.setLogLevel("ERROR")

    val schema = StructType(
      List(StructField("text", StringType, true)
      )
    )

    val df = spark.readStream
      .schema(schema)
      .json("./stream_folder")
    df.printSchema()


    val t1 = System.nanoTime

    var details = false
    if (details) {
      val groupDF = df.select("text").
        map(row => (row.getString(0), process_polarity(row.getString(0)), process_polarity_per_word(row.getString(0)))).
        toDF("Text", "Polarity", "Polarity per word")

      groupDF.writeStream
        .format("console")
        .outputMode("append")
        .option("truncate", "false")
        .start()             // Start the computation
        .awaitTermination()
    } else {
      val avgDF = df.select("text")
        .map(row => (process_polarity(row.getString(0))))
        .toDF("Polarity")
        .select(avg("Polarity"), count("Polarity"))

      avgDF.writeStream
        .format("console")
        .outputMode("complete")
        .option("truncate", "false")
        .start()             // Start the computation
        .awaitTermination()
    }
  }
}