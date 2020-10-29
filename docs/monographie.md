---
consigne: http://prodageo.insa-rouen.fr/casimono/sujetprojmd/consignes.html
---
# Monographie - Big Data et tweet en temps réel

## Cartouche

 - Code du sujet : 30A
 - Code de l'alliance : 2020A30A
 - Liste des équipes
   - E11 - Blue-Bird
     - Poulain, Thomas (tpoulain)
     - Prieur, Maxime (Todaime)
     - Quarez, Etienne (equarez)
   - E12 - {Nom équipe 2}
     - Godey, Maël ({pseudo Github membre 2-1})
     - Lefebvre, Clément ({pseudo Github membre 2-1})
     - Michelet, Adrien (Adrien-Michelet)
   - E14 - {Nom équipe 3}
     - Germain, Louis (lgermainINSA)
     - Lenoir, Louis ({pseudo Github membre 2-1})
     - Zeghib, Amin ({pseudo Github membre 2-1})

## Partie A

### A0 : Introduction.

 Ce projet s'interesse aux différentes applications utilisant l'analyse de contenu textuel provenant du réseau social Twitter.
 Le but du projet est de choisir l'une des applications et de développer/mettre en place une architecture pour rendre celle-ci fonctionnelle.
 
### A1. Glossaire et Mots-clés.

#MachineLearning #IA #BigData #Tweet #TextMining #NLP #DataAnalysis #Trend #OpinionMining #SentimentAnalysis

### A2. Webographie

- <strong>twitter.com</strong> Site Officiel de twitter.

#### 1. Architecture

- <strong>https://big-data.developpez.com/tutoriels/apprendre-faire-choix-architecture-big-data/<strong> Site Developpez.com, tutoriel choix d'une architecture big-data
 - <strong>https://www.ibm.com/developerworks/library/os-twitterstorm/index.html</strong> Site IBM.com. Acteurs principaux de l'analyse de tweets en temps réels.

#### 2. Guides Python pour Twitter

- <strong>https://towardsdatascience.com/mining-twitter-data-ba4e44e6aecc</strong>, Site TowardsDataScience, Tutoriel  Python for : Authentication, Data Collection, Data Cleaning/Preprocessing, Modelling/Analysis.
- <strong>oreilly.com/library/view/mining-the-social/9781449394752/ch01s02.html</strong> Site O'Reilly, Collectiong and Manipulating Twitter Data
- <strong>https://www.toptal.com/python/twitter-data-mining-using-python</strong>, Site toptal.com, Tutoriel sur l'utilisation de l'API twitter avec python.
- <strong>https://www.kdnuggets.com/2016/06/mining-twitter-data-python-part-1.html</strong> Site Kdnuggets.com, Tutoriel Python pour : CollectionData, Text Pre-Processing, Term Frequencies, Term Co-occurrences, Data Visualisation Basics

### A3. Bibliographie

### 1. Thèses

#### a. Tweet

- <strong> Twitter as a Corpus for Sentiment Analysis and Opinion Mining</strong> Alexander Pak, Patrick Paroubek. 2010, LREC.
- <strong> Measuring User Influence in Twitter: The Million Follower Fallacy</storng> M Cha, H. Haddadi, F. Benevenuto, PK. Gummadi . 2010, ICWSM
- <strong>Predicting Elections with Twitter: What 140 Characters Reveal about Political Sentiment</strong> Andranik Tumasjan, Timm Olivier Sprenger, Philipp G. Sandner, Isabell Welpe.2010, ICWSM
- <strong>Everyone's an influencer: quantifying influence on twitter</strong> Eytan Bakshy, Jake M. Hofman, Winter A. Mason, Duncan J. Watts, 2011, ACM
- <strong> Sentiment Analysis of twitter data</strong> Apoorv Agarwal, Boyi Xie, Ilia Vovsha, Owen Rambow, Rebecca Passoneau, 2011, ACL
- <strong> Twitter Sentiment Classification using Distant Supervision</strong> Alec Go, Richa Bhayani, Lei Huang. 2009, Stanford
- <strong>Political Polarization on Twitter</strong> M.D Conover, J. Ratkiewicz, M Francisco, B Gonçalves, A Flammini, F Menczer, 2011,  AAAI
- <strong> Hashtag Graph Based Topic Model for Tweet Mining</strong> Yuan Wang, Jie Liu, Jishi Qu, Yalou Huang, Jimeng Chen, Xia Feng. 2014, IEEE  International Conference on Data Mining
- <strong>A Practical Approach for Content Mining of Tweets</strong> Sunmoo Yoon, Noémie Elhadad, Suzanne Bakken, 2013, American Journal of Preventive Medicine
bibliographie de 3 livres avec la mise en exergue des sections qui vous semblent pertinentes dans la table des matières
- <strong>Looking for the perfect tweet. The use of data mining techniques to find influencers on twitter</strong> Eva Lahuerta-Otero, Rebeca Cordero-Gutiérrez, 2016, Computers in Human Behavior

#### b. Big Data

- <strong> Beyond the hype: Big data concepts, methods, and analytics</strong> Amir Gandomi, Murtaza Haider. 2015. International Journal of information Management
- <strong> Data mining with big data</strong> Xindong Wu, Xingquan Zhu, Gong-Qing Wu, Wei Ding. 2013, IEEE : Transactions on Knowledge and Data Engineering

### 2. Livres

- <strong> Opinion Mining et Sentiment Analysis : Méthodes et outils</strong> Dominique Boullier, Audrey Lohard, 2012

### A4. Acteurs

 liste des trois grandes organisations dans le secteur de cette technique (qu’ils soient des organisme de standardisation, des communautés du logiciels libres ou des sociétés privées), on décrira chaque organisation en une dizaine de lignes et on montrera sa contribution à la technique étudiée. Au moins une des organisations doit mettre à disposition un livre blanc sur le sujet étudié
 
 #### 1. Storm (Twitter)
 
 Présenté Initialement par Nathan Marz, Storm est un systeme de calcul distribué gratuit et open source. Storm utilise le concept du flot de données (streaming data) supposé continu. Implémenté en Clojur (Language de VM tournant sur  la JVM), il permet d'utiliser nimporte quel language de programmation.
 
Le modèles Storm prends la forme d'unmodèle de traitement de flot de données. Les données sont representée par des tuples ou bien des types définis par l'utilsateur. Chaque flot est féfinis poar un ID unique utilisé pour construire la topologie des sources de données et des puits. Des connecteurs appelé Spouts aggregent le flot de données depuis les sources vers le modèle Storm. Les entités aplliquant les transformations sont appelé des Bolt et implémentent chacun une transformation sur le flot de données (MapReduce, SingleStep Function, etc...).

L'une des particularités de Storm est la garantie que toutes données provenant d'une des sources sera traitée. Lorsque l'une des entrées n'a pas le temps d'être traitée elle est relancé vers l'entrée du modèle.

Remarque : Dans le cas ou le nombre de noeud de calcul à disposition est trop bas, il est possible d'implementer Storm par le biens de Amazon Elastic Compute Cloud (EC2).
 
 #### 2. S4 (Yahoo)
 
 #### 3. Hadoop (Apache)
 
  Créé par Doug Cutting en 2009, Hadoop est le framework maître dans l'art de l'analyse big-data. Libre, open source et écrit en Java, Hadoop permet la mise en place d'application distribuées en terme de stockage de données et de leur traitement. L'idée du framework Hadoop est de pouvoir gérer automatiquement les pannes matérielle supposées fréquentes.
  
  Concentrée sur le traitement par lots (batch). Les données sont introduites en entrée dans le HDFS (Hadoop distributed file system), séparées en batch et ensuite réparties vers différents noeuds ayant reçu le code à executer (MapReduce). A la fin des traitement les données sont retournées au HDFS.
 
 Quatres modules : Hadoop Common, Hadoop Distributed File System, Hadoop YARN, Hadoop MapReduce.
 
 De nombreuses grandes entreprises comme Facebook, Yahoo ou bien encore Microsoft utilisent Hadoop.
 
 #### 4. Spark Streaming (UC Berkeley & AMPLab)
 
 Implémenté en Scala.
 
 #### 5. Disco (Nokia)
 
 #### 6. HPCC (LexisNexis)
 
 #### 7. Azure stream analytics (Microsoft)
 
 #### 8. Snowflake

### A5. Facteurs qualité

 liste de 3 sous-caractéristiques prises parmi les 21 de ISO9126 (qu’on appelle aussi critères chez McCall) auquel répond cette technique, et ce tout particulièrement dans le contexte indiqué.
 
 Real-time 
 
Massive Data : Robustness?

### A6. Indicateurs qualité

 Liste d’au moins deux indicateurs de base (ou mesures au sens ISO9126) et d’au moins un indicateur dérivé pour chacun des trois facteurs/sous-facteurs identifiés dans la question A5.

### A7. Références théoriques

 Structurer (et/ou hiérachiser) les différentes références du référentiel théorique (ainsi que les références que vous avez identifiées). Dans le cas où le référentiel théorique comprend un (voire des) catalogue(s) de patterns, on précisera notamment la liste des thématiques (problem area) ainsi que la grille de présentation des patterns (les rubriques de la description d’un pattern, et leur sémantique). Rappel : par référentiel théorique est entendu l’ensemble des patterns qui ont pu vous être soumis dans le sujet ou que vous avez pu identifier lors de la rédaction de la monographie (notamment la version A). A noter également quelques catalogues rencontrés en cours :
POSA4 : http://www.dre.vanderbilt.edu/~schmidt/POSA4-TOC.pdf
PofEAA : http://martinfowler.com/books/eaa.html

## Partie B

### B1. Approche technique

### B2. Solutions technologiques concurrentes

### B3. Solutions retenues

### B4. Liste de métriques

### B5. Découpage (WBS) pour réalisation des prototypes

## Partie C

### C1. Architecture solution W

### C2. Architecture solution X

### C3. Architecture solution Y

### C4. Architecture solution Z
