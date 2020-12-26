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
        }
        return 1
      };
      if (subj_word=="strongsubj"){
        if (polarity=="positive"){
          return 2
        }
        return -2
      }
    }
    return 0
  }

  def process_polarity(text: String):Integer={
    var sum = 0
    var words = text.split(' ').foreach(sum+=get_polarity(_))
    return sum
  }

  def main(args: Array[String]): Unit = {
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
      .json("../stream_folder")

    df.printSchema()
    val groupDF = df.select("text").
      map(row => row.getString(0)+ " POLARITY : "+process_polarity(row.getString(0))).
      toDF("Text + Polarity")
    groupDF.printSchema()
    groupDF.writeStream
      .format("console")
      .outputMode("append")
      .option("truncate", "false")
      .option("numRows", 100)
      .start()             // Start the computation
      .awaitTermination()
  }
}