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
   - E12 - Brocoli-Carottes
     - Godey, Maël (MaelGodey)
     - Lefebvre, Clément (clefebvre01)
     - Michelet, Adrien (Adrien-Michelet)
   - E14 - {Nom équipe 3}
     - Germain, Louis (lgermainINSA)
     - Lenoir, Louis ({pseudo Github membre 2-1})
     - Zeghib, Amin ({pseudo Github membre 2-1})
   - E02 - CasimentPasDIdee
     - Abecassis, Zoé (zabecassis)
     - Lesseure, Cassandre (cleseurre)
     - Quéré, David (DavidQuere)

## Partie A

### A0 : Introduction.

Ces dernières années, l'explosion quantitative des données numériques a contraint la communauté scientifique à repenser la manière dont l'être humain analyse celles-ci. Il s'agit de mettre en place de nouveaux outils permettant la capture, la recherche, le partage, le stockage, l’analyse et la présentation rapide de données. Ces méthodes sont désigné par le terme <em>Big Data</em>.

L'objectif du projet est de mettre en place une architecture, à l'aide de technologies de la famille du <em>Big Data</em>, permettant l'analyse rapide d'un gros volume de données en flux continu semi-structuré. Le flux que nous anlyserons est un flux de tweets de jeunes diplomés dont il faudra déterminer la tendance, positive ou négative.

Il semble bon de définir quelques termes avant de commencer le projet.

##### <em>Cluster</em>

On désigne par grappe de serveurs (<em>cluster</em>) ou de groupement de serveurs les techniques basées sur le regroupement de plusieurs ordinateurs indépendants.  
Cette configuration permet une gestion globale et de dépasser les limitations d'un unique ordinateur.
Les grappes de serveurs ont plusieurs avantages comme augmenter la disponibilité, faciliter la gestion des ressources (RAM, ROM ...) entre autre.

##### <em>HA cluster</em>
Les grappes à haute disponibilité (<em>High-availability cluster</em>) sont des grappes de serveurs qui prennent en charge des applications pouvant être utilisées de manière fiable avec un minimum de temps d'arrêt. Elles assurent un service continu lorsqu'un ou plusieurs des composants du système tombent en panne. 
La mise en place de grappes à haute disponibilité permet de détecter les défaillances matérielles/logicielles et de redémarrer immédiatement l'application sur un autre système automatiquement.

##### <em>Load-balancing cluster</em>
Les grappes à répartition de charge (<em>Load-balancing cluster</em>) drépartissent les tâches à effectuer sur un ensemble de ressources, dans le but d’en rendre le traitement global plus efficace. 
La répartition de charge a deux objectifs:
* Permettre d’optimiser le temps de réponse pour chaque tâche
* Éviter de surcharger de manière inégale les ordinateurs de la grappe lors de l'excecution d'une tâche. 

##### <em>HPC cluster</em>

Les grappes de calcul (<em> High-performance computing cluster</em>) désginent les grappes qui utilisent des supercalculateurs pour réaliser leurs tâches.

##### <em>Grid computing</em>


### A1. Glossaire et Mots-clés.

#MachineLearning #Données #Traitement #IA #BigData #Tweet #TextMining #NLP #DataAnalysis #Trend #OpinionMining #SentimentAnalysis

### A2. Webographie

- <strong>twitter.com</strong> Site Officiel de twitter.

#### 1. Architecture

- <strong>https://big-data.developpez.com/tutoriels/apprendre-faire-choix-architecture-big-data/</strong> Site Developpez.com, tutoriel choix d'une architecture big-data
 - <strong>https://www.ibm.com/developerworks/library/os-twitterstorm/index.html</strong> Site IBM.com. Acteurs principaux de l'analyse de tweets en temps réels.

#### 2. Guides Python pour Twitter

- <strong>https://towardsdatascience.com/mining-twitter-data-ba4e44e6aecc</strong>, Site TowardsDataScience, Tutoriel  Python for : Authentication, Data Collection, Data Cleaning/Preprocessing, Modelling/Analysis.
- <strong>oreilly.com/library/view/mining-the-social/9781449394752/ch01s02.html</strong> Site O'Reilly, Collectiong and Manipulating Twitter Data
- <strong>https://www.toptal.com/python/twitter-data-mining-using-python</strong>, Site toptal.com, Tutoriel sur l'utilisation de l'API twitter avec python.
- <strong>https://www.kdnuggets.com/2016/06/mining-twitter-data-python-part-1.html</strong> Site Kdnuggets.com, Tutoriel Python pour : CollectionData, Text Pre-Processing, Term Frequencies, Term Co-occurrences, Data Visualisation Basics

### A3. Bibliographie

- <strong>Big Data at Work: Dispelling the Myths, Uncovering the Opportunities</strong> - Thomas H. Davenport - 2014

- <strong>Analytics in a Big Data World: The Essential Guide to Data Science and its Applications </strong> - Bart Baesens - 2014

- <strong>Sentiment Analysis: Mining Opinions, Sentiments, and Emotions</strong> -  Bing Liu - 2015





### 1. Thèses

#### a. Tweet

- <strong> Twitter as a Corpus for Sentiment Analysis and Opinion Mining</strong> Alexander Pak, Patrick Paroubek. 2010, LREC.
- <strong> Measuring User Influence in Twitter: The Million Follower Fallacy</strong> M Cha, H. Haddadi, F. Benevenuto, PK. Gummadi . 2010, ICWSM
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

 <em>liste des trois grandes organisations dans le secteur de cette technique (qu’ils soient des organisme de standardisation, des communautés du logiciels libres ou des sociétés privées), on décrira chaque organisation en une dizaine de lignes et on montrera sa contribution à la technique étudiée. Au moins une des organisations doit mettre à disposition un livre blanc sur le sujet étudié</em>
 
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
 
Extension de l'API Spark permettant un traitement rapide, robuste à la panne et scalable. Spark utilise le principe de micro-batch (les données reçues sont divisées en mini batch RDDs) puis traité par Spark Engine pour la génération du flux de résultats en batch. Spark Streaming fait appel à DStreams qui est une séquence de RDDs représentant un flux de données continu.

Spark Streaming à l'inverse de Storm qui traite les données en continue ajoute un délai entre l'arrivé d'un message et son traitement. Cependant en condition dégradée Spark assure un fonctionnement "at least once" qui assure qu'un message peut être délivré plusieur fois mais sans perte.
 
 #### 5. Disco (Nokia)
 
 #### 6. HPCC (LexisNexis)
 
 #### 7. Azure stream analytics (Microsoft)
 
 #### 8. Snowflake

### A5. Facteurs qualité

 liste de 3 sous-caractéristiques prises parmi les 21 de ISO9126 (qu’on appelle aussi critères chez McCall) auquel répond cette technique, et ce tout particulièrement dans le contexte indiqué.
 
 Afin de mener à bien notre projet, nous avons listé ci-dessous 3 sous-caractéristiques, issues de la norme qualité ISO9126, que nous avons jugé très pertinentes dans notre cas. En effet les données volumineuses que représentent les tweets imposent une certaine robustesse et fiabilité à notre application. Ainsi ces sous-caractéristiques représentent bien notre problème de gestion, transmition et traitement de grandes quantités de données tout en restant adaptable à d'autres contextes.
 
 - Sous-caractéristique 1 : Efficacité en ressources
Du fait du volume important de données, il est primordial de représenter et de stocker correctement l'information de façon à augmenter l'efficacité dans l'utilisation des ressources disponibles. En effet il peut arriver rapidemment que l'on manipule des données non pertinantes ou dupliquées si l'on ne gère pas correctement cette masse d'information.

 - Sous-caractéristique 2 : Modifiabilité
La source de données étant externe, le flux pourrait donc changer de format au cours du temps. Il faut donc pouvoir modifier rapidement le code pour qu'il s'adapte aux éventuels changements. De même, on peut vouloir changer l'algorithme de traitement des tweets pour obtenir de meilleurs résultats sans que cela ne nécessite de modifier l'entièreté du code.

 - Sous-caractéristique 3 : Efficacité d'exécution
L'application doit impérativement s'exécuter de manière efficace pour pouvoir traiter une grande quantité de données en un temps raisonnable. Il ne doit y avoir aucun blocage que ce soit lié au traitement d'un tweet ou bien à la transmission des informations.

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
