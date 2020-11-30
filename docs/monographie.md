---
consigne: http://prodageo.insa-rouen.fr/casimono/sujetprojmd/consignes.html
---

# Monographie - Big Data et tweet en temps réel

## Cartouche

- Code du sujet : 30A
- Code de l'alliance : 2020A30A
- Liste des équipes
  - <strong> E11 - Blue-Bird </strong>
    - Poulain, Thomas (tpoulain)
    - Prieur, Maxime (Todaime)
    - Quarez, Etienne (equarez)
  - <strong> E12 - Brocoli-Carottes </strong>
    - Godey, Maël (MaelGodey)
    - Lefebvre, Clément (clefebvre01)
    - Michelet, Adrien (Adrien-Michelet)
  - <strong> E14 - Troisième équipe </strong>
    - Germain, Louis (lgermainINSA)
    - Lenoir, Louis (Loulen)
    - Zeghib, Amin (Sklaer)
  - <strong> E02 - CasimentPasDIdee </strong>
    - Abecassis, Zoé (zabecassis)
    - Lesseure, Cassandre (cleseurre)
    - Quéré, David (DavidQuere)
  - <strong> E01 - JuPiLu </strong>
    - Chan, Justin (jchanUML)
    - Cleret, Luc (luccleret)
    - Mazari, Pierre (pizza59)

## Partie A

### A0 : Introduction.

Ces dernières années, l'explosion quantitative des données numériques a contraint la communauté scientifique à repenser la manière dont l'être humain analyse celles-ci.
Il s'agit de mettre en place de nouveaux outils permettant la capture, la recherche, le partage, le stockage, l’analyse et la présentation rapide de données.
Ces méthodes sont désigné par le terme <em>Big Data</em>.

L'objectif du projet est de mettre en place une architecture, à l'aide de technologies de la famille du <em>Big Data</em>, permettant l'analyse rapide d'un gros volume de données en flux continu semi-structuré.
Le flux que nous analyserons est un flux de tweets de jeunes diplomés dont il faudra déterminer la tendance, positive ou négative.

Il semble bon de définir quelques termes avant de commencer le projet.

##### <em>Cluster</em>

On désigne par grappe de serveurs (<em>cluster</em>) ou de groupement de serveurs les techniques basées sur le regroupement de plusieurs ordinateurs indépendants.  
Cette configuration permet une gestion globale et de dépasser les limitations d'un unique ordinateur.
Les grappes de serveurs ont plusieurs avantages comme augmenter la disponibilité, faciliter la gestion des ressources (RAM, ROM ...) entre autre.

##### <em>HA cluster</em>

Les grappes à haute disponibilité (<em>High-availability cluster</em>) sont des grappes de serveurs qui prennent en charge des applications pouvant être utilisées de manière fiable avec un minimum de temps d'arrêt. Elles assurent un service continu lorsqu'un ou plusieurs des composants du système tombent en panne.
La mise en place de grappes à haute disponibilité permet de détecter les défaillances matérielles/logicielles et de redémarrer immédiatement l'application sur un autre système automatiquement.

##### <em>Load-balancing cluster</em>

Les grappes à répartition de charge (<em>Load-balancing cluster</em>) répartissent les tâches à effectuer sur un ensemble de ressources, dans le but d’en rendre le traitement global plus efficace.
La répartition de charge a deux objectifs:

- Permettre d’optimiser le temps de réponse pour chaque tâche
- Éviter de surcharger de manière inégale les ordinateurs de la grappe lors de l'excecution d'une tâche.

##### <em>HPC cluster</em>

Les grappes de calcul (<em> High-performance computing cluster</em>) désginent les grappes qui utilisent des supercalculateurs pour réaliser leurs tâches.

##### <em>Grid computing</em>

Une grille de calcul (<em>Grid computing</em>) est une infrastructure virtuelle (relations logiques entre les entités qui la composent) constituée d'un ensemble de ressources informatiques partagées, distribuées, hétérogènes, délocalisées et autonomes. Contrairement aux serveurs dans les clusters, chaque noeud d'une grille de calcul a une tâche différente de la plupart des autres noeuds et est faiblement couplé aux autre noeuds.

### A1. Glossaire et Mots-clés.

BigData; DataAnalysis; Tweet; MachineLearning; Traitement; Stockage; TextMining; NLP; Trend; OpinionMining

### A2. Webographie

- <strong>twitter.com</strong> Site Officiel de twitter.

#### 1. Architecture

- <strong>https://big-data.developpez.com/tutoriels/apprendre-faire-choix-architecture-big-data/</strong> Site Developpez.com, Présentation des enjeux du Big Data et de ses acteurs, présentation des architectures et solutions disponibles.

#### 2. Guides Python pour Twitter

- <strong>https://www.kdnuggets.com/2016/06/mining-twitter-data-python-part-1.html</strong> Site Kdnuggets.com, Tutoriel Python pour : CollectionData, Text Pre-Processing, Term Frequencies, Term Co-occurrences, Data Visualisation Basics

#### 3. Tutoriels d'analyse de Tweets

- <strong>https://www.tandfonline.com/doi/full/10.1080/23311916.2018.1534519?fbclid=IwAR2Zd6HcyGqEiKcBaNubOsAv8NZ_cyWZO3hVYkPMqO-lIIDuj9PVuJaa9-A&</strong>, Tutoriel d’analyse de tweets avec Hadoop

### A3. Bibliographie

- <strong>Big Data at Work: Dispelling the Myths, Uncovering the Opportunities</strong> - Thomas H. Davenport - 2014

  - What technology you need to manage it
  - The key success factors in implementing any big data project

- <strong>Analytics in a Big Data World: The Essential Guide to Data Science and its Applications </strong> - Bart Baesens - 2014

  - Chapter 3 - Predictive Analytics
  - Chapter 6 - Social Network Analytics
  - Chapter 8 Example Applications => Social Media Analytics

- <strong>Sentiment Analysis: Mining Opinions, Sentiments, and Emotions</strong> - Bing Liu - 2015
  - Chapters 3–9

Critères de choix :

- Publications assez récentes (moins de 10 ans)
- Ouvrages orientés sur l'utisation indistrielle du big data
- Auteurs légitimes (professeur reconnus ou chercheurs)

### A4. Acteurs

#### 1. Apache Software Foundation

est une organisation à but non-lucrative développant des logiciels open-source sous la licence Apache.
Si de nombreux projets sont sous licence Apache, pas seulement en matière de Big Data, on peut malgré tout noter que les frameworks les plus utilisés et reconnus sont sous cette licence.
En effet Hadoop, un des framework les plus connus pour le traitement de grandes quantités d’informations, est sous licence Apache depuis 2012. Hadoop est lui même composé de plusieurs modules à savoir : Hadoop Common, Hadoop Distributed File System (HDFS), Hadoop Yarn, Hadoop MapReduce. Tous ces modules fonctionnent ensemble et peuvent être couplés avec d’autres framework de l’environnement comme Hive, permettant d’éviter un traitement avec du Map Reduce en passant par du HQL, un langage très similaire au SQL.
Hadoop n’est pas le seul à faire partie de la fondation Apache puisque l’on retrouve aussi Spark, produisant de l’analyse de données plus rapidement qu’Hadoop.
Kafka, Hive ou encore Flink sont tous passés sous cette licence après leur création. Les projets sont donc ainsi tous open-source et bénéficient d’un nombre important de contributeurs. Parmi ceux-ci l’on retrouve les entreprises les plus influentes en matière de Big Data tel que Yahoo (premier créateur d’Hadoop), Google (créateur du MapReduce), IBM, Linkedin ou encore Facebook.

#### 2. Google 

a crée en 2004 MapReduce, un modèle de programmation utilisé pour traiter de gros flux de données. Si aujourd’hui MapReduce est de plus en plus délaissé, il a permis à Hadoop d’émerger et ainsi de mettre en lumière le calcul distribué et parallèle. L’enjeu est très important puisqu’à mesure qu’internet se développe, de plus en plus de données doivent être traitées. A titre d’exemple Facebook génère 4 Pétaoctets de nouvelle données chaque jour. Ainsi si toutes ces données doivent être analysées en un temps raisonnable, les algorithmes classiques ne le permettent pas. Map Reduce propose de diviser le problème en de nombreux sous-problèmes, indépendants les uns des autres, et d’ensuite tout rassembler. Chaque sous problème est traiter sur une machine indépendante, permettant le calcul parallèle et distribué. L’exemple le plus connu de Map Reduce est le word count, consistant à compter le nombre d’occurrences des mots dans un texte. Pour ce faire chaque ligne est séparée puis à chaque mot d’une ligne est attribué le nombre. Les données sont ensuite triées afin d’avoir les mots identiques ensemble. Finalement le nombre d’occurrences est ajouté (cf exemple si dessous). On peut retrouver un livre blanc de Google sur le sujet du Map Reduce qui détaille l’utilisation de Map Reduce sur un nombre important de machines.

![Map Recude exemple](https://www3.nd.edu/~pbui/teaching/cse.30331.fa16/static/img/mapreduce-wordcount.png)

https://static.googleusercontent.com/media/research.google.com/en//archive/mapreduce-osdi04.pdf

#### 3. Talend

est une entreprise française créée en 2006 spécialisée dans la gestion et l’intégration de données. Elle travaille en collaboration avec la fondation Apache, notamment dans les projets Spark ou Karaf. Son business model consiste à distribuer de manière open-source les projets sur lesquels elle travaille et contribuer à ceux existant tout en proposant des fonctionnalités complémentaires payantes, ainsi que du support et du conseil. Sur ce marché elle n’est pas la seule puisque Cloudera repose sur la même structure, cette fois davantage orientée vers Hadoop. Ces solutions sont utiles pour des entreprises souhaitant intégrer de l’analyse ou du stockage massif de données sans pour autant avoir les capacités humaines en terme de nombre ou de compétences, de le faire elle-même. La mise en place d’une architecture intégrant du Big Data peut se révéler longue et complexe tandis que des sociétés comme Talend ou Cloudera (acteurs majeurs du marché) permettent des solutions clef en main adaptés au besoin de chaque entreprise. Ils proposent des visualisations claires et esthétiques des données, ce que ne propose pas simplement les outils comme Hadoop.

### A5. Facteurs qualité

liste de 3 sous-caractéristiques prises parmi les 21 de ISO9126 (qu’on appelle aussi critères chez McCall) auquel répond cette technique, et ce tout particulièrement dans le contexte indiqué.

Afin de mener à bien notre projet, nous avons listé ci-dessous 3 sous-caractéristiques, issues de la norme qualité ISO9126, que nous avons jugé très pertinentes dans notre cas. En effet les données volumineuses que représentent les tweets imposent une certaine robustesse et fiabilité à notre application. Ainsi ces sous-caractéristiques représentent bien notre problème de gestion, transmition et traitement de grandes quantités de données tout en restant adaptable à d'autres contextes.

- Sous-caractéristique 1 : Efficacité en ressources
  Du fait du volume important de données, il est primordial de représenter et de stocker correctement l'information de façon à augmenter l'efficacité dans l'utilisation des ressources disponibles. En effet il peut arriver rapidemment que l'on manipule des données non pertinentes ou dupliquées si l'on ne gère pas correctement cette masse d'information.

- Sous-caractéristique 2 : Modifiabilité
  La source de données étant externe, le flux pourrait donc changer de format au cours du temps. Il faut donc pouvoir modifier rapidement le code pour qu'il s'adapte aux éventuels changements. De même, on peut vouloir changer l'algorithme de traitement des tweets pour obtenir de meilleurs résultats sans que cela ne nécessite de modifier l'entièreté du code.

- Sous-caractéristique 3 : Efficacité d'exécution
  L'application doit impérativement s'exécuter de manière efficace pour pouvoir traiter une grande quantité de données en un temps raisonnable. Il ne doit y avoir aucun blocage que ce soit lié au traitement d'un tweet ou bien à la transmission des informations.

### A6. Indicateurs qualité

Liste d’au moins deux indicateurs de base (ou mesures au sens ISO9126) et d’au moins un indicateur dérivé pour chacun des trois facteurs/sous-facteurs identifiés dans la question A5.

Big data ou non, il faut privilégier la qualité à la quantité. Aussi pour mesurer la qualité de la méthode nous aurons recours à des indicateurs, qui se rapportent notamment aux facteurs ISO9126 cités plus haut.

#### 1. Indicateurs de base

- **Indicateur de fonctionnalité** : Mesure de la précision de la tendance perçue par rapport au sujet.
- **Indicateur de fiabilité** : Mesure du temps moyen entre défaillances consécutives.

#### 2. Indicateurs dérivés

- **Efficacité en ressources** : Mesure de la mémoire vive et morte utilisée.
- **Modifiabilité** : Mesure du nombre de lignes de code.
- **Efficacité d'éxecution** : Mesure du nombre de tweets traités par seconde.
- **Efficacité d'éxecution** : Mesure du rapport entre le nombre de tweets à traiter et le temps de traitement.

### A7. Références théoriques

Le design pattern en adéquation avec ce sujet est le _Real-time streaming pattern_

Les différents objectifs de ce pattern sont :
La minimisation du temps de traitement des informations
Le traitement des évènements au travers d’unités indépendantes les unes des autres.
Le support de l’échec du traitement des informations

Comme chaque tweet est traité séparément, et les unités de traitement indépendantes du support, il est possible d’établir une architecture scalable, que ce soit horizontalement ou verticalement. Ce pattern est donc adapté à la lecture de tweets en temps réel.

Cela permet aussi de rendre le système résilient et de résister aux échecs. Ainsi la stabilité du programme est maintenue à tout moment.

Ce pattern peut être implémenté grâce à plusieurs frameworks tels que akka (Java) ou avec le langage Scala, qui utilise le paradigme acteur.

Chaque acteur peut-être associé à une unité de traitement, indépendante des autres. L’utilisation du framework permet une utilisation plus simple car il gère seul la durée de vie et de mort des acteurs et cela à la fin d’une tâche ou quand une erreur se produit.

Dans “Clean architecture” de Robert Martin, on trouve un catalogue de design patterns de Big Data. On y trouve différents patterns en adéquation avec notre sujet :

#### Exception :

Ce pattern permet notamment une meilleure prévision des exceptions dans le code. De plus, il instaure un système de logs pour plus de facilité à gérer les anomalies.

L’importance de ce pattern réside dans le fait que potentiellement chaque donnée peut être mal traitée et donc faire échouer le programme. Ce pattern nous incite à séparer les différentes étapes du traitement, en effet avoir une distinction précise entre chaque traitement permet d’avoir une meilleure lisibilité, interprétabilité, et de rendre le traitement plus facilement debuggable.
Les différentes étapes peuvent être :

- Obtention des données
- Pré-traitement des données (Normalisation)
- Sauvegarde
- Processus principal (comptage des mots positifs/négatifs dans notre cas)
- Livraison des données

Les données peuvent être livrées sous plusieurs formes. On pense notamment au stockage dans une ou plusieures bases de données bien qu’elles puissent également être copiées sur plusieurs supports afin de pérenniser les données.

## Partie B

### B1. Approche technique

texte de 2 à 3 pages qui montre les principales caractéristiques des approches techniques sur le sujet (on utilisera de manière privilégiée les patterns pour étayer la description).

Quatre types de pattern ressortent lorsque l'on s'intéresse à une application traitant un flot continu (Streaming) de données : des patterns d'architectures, des patterns fonctionnels, des patterns de gestion des données et des patterns de sécurité des données. Ici nous écarterons délibérément le dernier pattern, Data Security, puisque ce n'est pas un facteur qualité que nous avons choisi de traiter en priorité.

#### a. Streaming-Architecture Pattern

Le traitement et l'analyse de données en temps reel est un problème qui est abordé dans la plupart des cas en adoptant l'une des trois architecture : générique, Lambda, Kappa et Smack. L'architecture de streaming étant un ensemble définis de composants en interaction mutuelle dans le but d'effectuer une série d'actions/traitements sur une série non bornée de données au moment de leur création.

##### Real Time Streaming Architecture

<p align="center">
<img src="https://github.com/prodageo/mniproj2020b-2020a30a/blob/master/docs/img/NortonWorks_RealTimeStreaming_Architecture.png" width="600">
</p>
<p align="center"> Architecture générique de traitement de données en temps-réel (NortonWorks)</p>

De façon générale, l'architecture mise en place dans le but de traiter un flot continu de données peut se représenter comme une pipeline d'étapes de traitement où chacune possede plusieurs solutions possibles. Ainsi certains élements se retrouvent dans quasiment chaque architecture :

###### Message Broker / Stream Processor

Cet élément récupère les données à la source (the producer) les formate et renvoie le flot de données. Le reste des composants peuvent alors récupérer ces données précédemment traitées. Les premières technologies de message broker étaient basées sur le concept Message Oriented Middleware (MOM) qui a vite été remplacé par des plateformes (stream processors) plus performantes. L'un des streams processors les plus performant et open-source reste Kafka de la fondation Apache.

###### ETL (Extract-Transform-Load) par batch et real-time

Les flux de données provenant des message brokers explicités précédemment requièrent par la suite d'être aggrégés, transformés et structurés pour ensuite être analysés . C'est le rôle qui est rempli par les ETL. On peut citer parmi les ETL open-source les plus connus: Apache Storm et Spark Streaming.

###### Composant de stockage des données

Dans notre cas, il est possible de réutiliser le composant message broker pour stocker nos données puisque celles-ci n'ont pas pour but d'etre conservées.

###### Data Analytics

Lorsque les données sont prêtes à être utilisées, les outils d'analyse entrent en jeu. On peut cette fois-ci parler des outils Cassandra ou encore ElasticSearch.

##### Lambda Architecture

Imaginée par Nathan Marz et James Warren, l'architecture Lambda est conçue pour effectuer en simultané, un traitement de type batch tout en ayant un flot d'entré continu. L'architecture se découpe en trois couches.

<p align="center">
<img src="https://github.com/prodageo/mniproj2020b-2020a30a/blob/master/docs/img/NortonWorks_Lambda_Architecture.png" width="600">
</p>
<p align="center">Lambda Architecture (NortonWorks)</p>

Avant le traitement des trois couches, entre en jeu la source de données. Celle-ci prend souvent la forme d'une source en streaming comme Apache-Kafka, cette derniere n'est pas la source originale mais constitue un intermédiaire de stockage afin de fournir simultanément en données, à la fois, la couche par Batch et la couche de traitement en temps-réel. Cet approvisionnement simultané permet une indexation faite en parallèle.

La couche de Batch, stocke les données en batch en prévision d'une indexation. Dans une majorité des cas, l'enregistrement des données s'effectue simplement sous format CSV. Pour préserver l'intégrité des données, le contenu des fichiers enregistrés ne sont modifiable que par ajout de contenu. La technologie la plus utilisée pour cette couche reste Apache Hadoop puisqu'elle permet l'ajout et l'enregistrement des données de manière efficace.

La couche de service indexe les vues de batchs de façon incrémentale afin de les rendres disponible à l'utilisateur. L'indexation est effectuée da façon parallélisé afin d'optimiser le temps d'indexation. Les nouvelles données sont ajoutées à une file pour être indexées lorsqu'un nouveau job se lance.

La couche de temps réel (SpeedLayer), est un complément de la couche de service puisqu'elle indexe les données récentes qui n'ont pas encore été indexées par cette dernière.

Les bénéfices de l'architecture Lambda réside dans :

- La réduction de la latence grâce à sa couche de service.
- La réduction du risque d'inconsistence dans les données puique les données sont traitées de façon séquentielle.
- La facilité de l'architecture à traiter des volumes variables de données. L'architecture est basée sur des technologies pouvant évoluer en y ajoutant des noeuds de traitement dans chacune des couches.
- La tolérance à des pannes matérielles, puisque comme dit précédemment les technologies utilisées dans l'architecture font appel a plusieurs noeuds de traitement, il est donc facile de continuer le traitement en cas de pannes d'un des noeuds.

Pour séparer les différentes parties de l'architecture donnant lieu à un choix de solution, on a la partie de Stockage (NoSQL, Kafka, HDFS, ...), la couche de batch (Spark, Flink, Hadoop MapReduce, ...), la couche en temps réel (Storm, Spark, Flink, Samza, ...) et la couche de service (Druid, ElasticSearch, Hive, HBase, Cassandra, ...).

##### Kappa Architecture

Proposée apres l'architecture Lambda par Jay Kreps, l'architecture Kappa stocke une série de données dans une messaging engine (Apache ou Kafka) qui lit, formate et stocks les données dans une base de données disponible pour le traitement final. L'architecture Kappa fait office d'alternative simplifiée à l'architecture Lambda, puisque les deux architecture utilisent le même ensemble de technnologies mais Kappa se démarque par le fait que les données sont considérées comme un flot, la partie de traitement par flot de Kappa est ainsi la seule partie de transformation des données. Kappa fusionne les couches en temps-réel et en batch de Lambda. Cependant, le système de stockage de l'architecture est plus restreint et doit ainsi être un système traitant des fichiers de type log et non modifiable (Ex : Kafka).

<p align="center">
<img src="https://github.com/prodageo/mniproj2020b-2020a30a/blob/master/docs/img/NortonWorks_Kappa_Architecture.png" width="600">
 </p>
<p align="center">Kappa Architecture (NortonWorks)</p>

Le service de stockage de messages de l'architecture Kappa garde les données de façon temporaire. Kappa est donc, encore plus que Lambda, destiné à du traitement de données. Concernant les solutions pour chaque partie on peut retrouver : pour le stockage (Kafka, ...), le traitement (Storm, Spark, Flink, Samza, ...) et pour la couche de service (Druid, Cassandra, Hive, HBase, ElasticSearch, ...).

#### b. Functional Patterns

##### Stream Joins

Le concept de ce pattern est de relier différents streams pour en créer un nouveau. Si on prend l'exemple de capteurs, il est possible de rassembler leurs streams pour créer un capteur mesurant une nouvelle grandeur.

##### Rolling Windows

En analysant un flot continu d'information, il est parfois nécessaire de revenir en arrière et d'accéder à des informations passées. Mais des règles peuvent parfois empêcher d'y accéder : respect de la vie privée, disparitions de l'information, stockage trop lourd,... L'idée du pattern est de mettre en place une fenêtre semblable à une file d'attente où les données trop anciennes en sortent en fonction de règles fixés à l'avance. Les seulles données accessibles par les composants d'analyse sont alors celles dans la file d'attente.

#### c. Data Management Patterns

##### 1. External Lookup

Quand l'analyse de streams dépend de données extérieures au système, ce pattern peut être utilisé. L'idée du pattern est d'équilibrer le taux de 'fetch' avec le taux de 'cache' pour maximiser la vitesse d'accès aux données extérieures tout en évitant de saturer la mémoire du système.

##### 2. Responsive Shuffling

Ajustement automatique de la répartition des données pour de meilleures performances lors de pic d'activité tout en variant le biais des données.

##### 3. Out-Of-Sequence Events

Ce pattern tente de résoudre le problème suivant : quand un évènement d'un flux d'information est reçu trop tard par le système (des évènements postérieurs à celui-ci ont déjà été analysés) et que l'ordre des évènements est important. Ce pattern propose de répartir la gestion des évènements "à l'heure" et des évènements "en retard" dans deux processus différents, offrant le meilleur compromis entre le rejet des évènements en retard et l'attente des évènements en retard.

#### d. Techniques

##### Micro-Batching

Afin de traiter un flot continu de données, Hadoop utilise le concept de micro-batching consistant à regrouper les tâches entrantes à exécuter en petits lots afin d'obtenir une partie des avantages de performance du traitement par lots, sans trop augmenter le temps de latence pour l'achèvement de chaque tâche.
Le micro-batching est généralement appliqué dans les systèmes où la quantité de tâches entrantes est variable. Le système saisit toutes les tâches entrantes reçues et les exécute par lots. Ce processus est exécuté de manière répétitive.

##### HDFS (Hadoop Distributed File System)

HDFS (Hadoop Distributed File System) est un système de fichier distribué permettant de stocker et de récupérer des fichiers en un temps très court. En combinaison avec <strong>YARN</strong>, ce système augmente les possibilités de gestion de données du cluster HDFS Hadoop et permet donc de traiter le Big Data. Le système est capable de gérer des milliers de nœuds sans intervention d’un opérateur. Il permet de bénéficier simultanément des avantages du computing parallèle et du computing distribué. HDFS peut être lancé sur commodity hardware, ce qui le rend très tolérant aux erreurs. Les serveurs sont connectés et communiquent par le biais de protocoles TCP.

<p align="center">
<img src="https://github.com/prodageo/mniproj2020b-2020a30a/blob/master/docs/img/hdfs_architecture.jpg" width="400">
</p>
<p align="center">Fonctionnement HDFS</p>

Le Hadoop Distributed File System (HDFS) repose sur une architecture maître/esclave.Chaque cluster comporte un Namenode individuel faisant office de serveur principal. Ainsi, les clients peuvent accéder aux bonnes données au bon moment. Le Namenode se charge également d’ouvrir, fermer, renommer les fichiers ou même les dossiers. Chaque nœud comporte également un ou plusieurs Datanode, auquel est assignée la tâche de gérer le stockage associé au nœud. Les blocs sont cartographiés par le Namenode pour les Datanodes. Le format suit un système de hiérarchisation de fichiers. Il semble bon de noter que la réplication de données est une partie essentielle du format HDFS

##### MapReduce

MapReduce est un Framework de traitement de données en clusters. il permet de répartir les tâches de traitement de données entre différents ordinateurs, pour ensuite réduire les résultats en une seule synthèse.

<p align="center">
<img src="https://github.com/prodageo/mniproj2020b-2020a30a/blob/master/docs/img/mapreduce-fonctionnement.jpg" width="400">
</p>
<p align="center">Fonctionnement de Map reduce</p>

Il est executé en 3 étapes (Map, Shuffle, Reduce), MapReduce est un model de programmation permettant le traitement grands ensemble de donnée.

- <strong>Map</strong>:
  Les données en entrée sont partitionnées pour que ces nouveaux échantillons soient envoyé à un programme appliquant la fonction de mapping. La fonction de mapping produit des paires (clé, valeur).
- <strong>Shuffle</strong>:
  Les paires (clé, valeur) sont regroupé par clé et chaque groupe est envoyé à la partie de Réduction correspondante.

##### Yarn (Yet Another Ressource Negotiatior)

Fait office d'interface entre <strong>MapReduce</strong> et <strong>HDFS</strong>. MapReduce utilise YARN pour distribuer des requêtes (appelé jobs) dans le cluster.
YARN est basé sur une architecture maître(ResourceManager ou JobTracker)/esclave(NodeManager ou TaskTracker). Chaque machine esclave exécute un démon NodeManager pour YARN.

##### Fonctionnement de Kafka

Utilisé pour la mise en place de « data pipeline » temps réel Kafka permet le traitement complexe et en temps réel de données.

<p align="center">
<img src="https://github.com/prodageo/mniproj2020b-2020a30a/blob/master/docs/img/Overview_of_Apache_Kafka_architecture.svg" width="600">
</p>
<p align="center">Apache Kafka Architecture </p>

Il comprend cinq APIs de base :

- <strong>Producer API</strong> permet aux applications d'envoyer des flux de données aux topics du cluster Kafka.
- <strong>Consumer API</strong> permet aux applications de lire des flux de données à partir des topics du cluster Kafka.
- <strong>Streams API</strong> permet de transformer des flux de données en topic de sortie.
- <strong>Connect API</strong> permet d'implémenter des connecteurs qui récupèrent les données d'un système source ou d'une application vers Kafka ou qui poussent de Kafka vers une application.
- <strong>AdminClient API</strong> permet de gérer et d'inspecter les topics, les brokers, et les autres objets Kafka .

### B2. Solutions technologiques concurrentes

liste des solutions technologiques concurrentes mettant en œuvre une des approches techniques (de manière plus ou moins explicite), et parmi cette liste, le choix de deux solutions technologies Y et Z pour prototypage. Pour les solutions choisies, assurez-vous que vous êtes bien en mesure de les mettre en œuvre (prérequis accessibles, licences d’évaluation disponibles en cas de modèle payant, …).

- hadoop => Zoé
- hive (solution implémentée par le groupe E02) => Zoé
- flink => David
- storm => David

#### Flink

Flink est un moteur de traitement des flux de données open source développé par Apache. Les applications Flink peuvent être développé en Java, Python, Scala ou SQL et seront compilées pour tourner dans une VM Java. Flink est fait pour tourner sur des grappes d'appareils et traiter des flux de données à très haute vitesse, avec une latence faible. Les difféntes tâches/opérations peuvent être parallisées et distubuées, ce qui rend cette technologie très scalable. Globalement l'écosystème Flink est assez étendu, ce qui donne accès aux applications de machine learning, de graphe, etc

![Archi Flink](https://flink.apache.org/img/flink-home-graphic.png)

Flink permet de gérer des calculs avec état mais ne comprend pas de stockage de données propre. Cependant, des connecteurs sont disponibles pour pouvoir se connecter à la plupart des sources de données.

Flink est assez tolérant au niveau des "pannes". En effet, il permet d'éviter le crash complet d'une pipeline grâce un système de checpoint. Ces checkpoints réguliers permettent de revenir en arrière si une erreur s'est produit lors du traitemebt de données.

![Flink checkpoints](https://boontadata.github.io/static/img/flink/flink-6.png)

#### Storm

Storm est un moteur Java de traitement de flux distribué, open source depuis son acquisition par Twitter. Storm gère les données sous formes de tuples. La strcuture de ces tuples étant dynamique, il n'y a pas besoin de déclarer explicitement la structure d'une donnée, les évolutions sont ainsi simplifiées. STorm permet le traitement de données en temps réel.

Une pipeline Storm utilise :

- Des **spouts**, le points de départs du flux de traitement. Les spouts permettent de charger et éventuellement mettre en forme les données
- Des **bolts**, les traitements. Le sbolts constituent le coeur de la chaîne de traitement : hashage, prédiction, écriture dans une BD, ...

![Storm fonctionnement](https://blog.octo.com/wp-content/uploads/2013/09/Capture-decran-2013-09-26-a-23.11.15.png)

Les applications sont construites d'une façon assez particulière. Elles sont en effet conçues comme une topologie représentée sous forme de graphe. Comme vous pouvez le voir ci-dessus, les spouts et les bolts constituent les sommet de ce graphe.

Storm est capable de distribuer, et éventuellement paralléliser, les différents composants sur un ou plusieurs worker. Un worker étant simplement une JVM s'éxécutant sur une des machines du cluster.

![Strom parallélisme](https://i0.wp.com/blog.zenika.com/wp-content/uploads/2014/02/figure-3-storm-parallelism_m-1.jpg?ssl=1)

#### Spark

Spark est un framework open-source de calcul distribué (cf wikipédia). A l’origine développé par l’université de Berkeley en 2009, il fait aujourd’hui parti de la fondation Apache où il est l’un des projets les plus actifs. Il est très populaire car il exécute ses calculs en temps-réel sans stockage d’information (contrairement à Hadoop). De ce fait, il est beaucoup plus rapide qu’Hadoop (cent fois plus rapide) et est utilisé par de nombreuses entreprises telles que Netflix, Yahoo ou eBay.
Spark est écrit en Scala et est plus performant avec celui-ci mais il est également possible d’écrire ses programmes en Java ou Python. Il est composé d’un ensemble d’outils, dont certains peuvent être utilisés séparément. La base est Spark Streaming qui permet de faire le calcul en temps réel. Vient ensuite Spark SQL permettant d’exécuter les requêtes sous forme de requêtes SQL. Ce sont les deux parties de Spark que nous utiliserons pour ce projet (ensemble ou séparément). Il y a aussi Spark Graph X pour le traitement d’informations issues de graphes et Spark Mlib qui est une bibliothèque contenant des algorithmes classiques d’apprentissage (classification, clustering,…). Ces deux dernières parties de Spark sont moins utilisées et ne sont pas réellement pertinentes pour notre projet, nous ne les détaillerons pas davantage.

![Spark tools](https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/Sch%C3%A9ma_d%C3%A9tail_outils_spark.png/377px-Sch%C3%A9ma_d%C3%A9tail_outils_spark.png)

Spark s’appuie sur le modèle d’architecture « maître-esclave. » Le « maître » s’occupe de répartir les tâches et les « esclaves » de les accomplir.

![Spark architecture](https://meritis.fr/wp-content/uploads/2018/11/image3.png)

Le « maître » contient le SparkContext qui est le point d’accès à toutes les fonctionnalités de Spark. On voit bien ici que le calcul est parallélisé avec différentes « esclaves ». Plus le nombre d’« esclaves » est important (avec chaque « esclave » sur une machine différente) plus le calcul pourra être effectué rapidement.

##### Spark Streaming

Spark Streaming est utilisé notamment pour le traitement de flux continue. Des informations (par exemple des tweets) émis en continue sont envoyées par des outils comme Kafka à Spark Streaming qui va ensuite process ces données en les découpant en plusieurs batch plusieurs données accumulées pendant un certain laps de temps). Ce n’est pas donc pas totalement du streaming puisque les informations sont tout de même séparées en batch, nous sommes donc entre Hadoop, qui ne fait pas du tout de temps réel et des outils comme Flink qui font du 100 % temps réel sans micro-batch.
Une fois les informations découpées en micro-batch, elles sont traitées par Spark Engine, le cœur de Spark.

<p align="center">
<img src="https://spark.apache.org/docs/2.2.0/img/streaming-arch.png" width="500">
</p>
<p align="center">Spark Streaming architecture</p>

##### Spark SQL

Spark SQL permet d’utiliser plus facilement Spark. En effet le langage SQL est un vieux langage très largement répandu pour les bases données. Ainsi pour explorer des données et en sélectionner il est plus simple de créer une requête SQL plutôt que d’apprendre un nouveau langage et même une nouvelle façon de réfléchir aux algorithmes. Dans cette optique de facilité, Spark SQL a été crée. S’il y a certaines différences avec du SQL classique, la syntaxe reste similaire. De plus il est utilisable avec JDBC, un connecteur de bases de données très connu en Java.
En utilisant Spark SQL on peut avoir l’impression que les données sont stockées sous formes de tables comme dans des bases de données relationnelles classiques mais il s’agit seulement d’une projection faite pour faciliter la vie du programmeur.

<p align="center">
<img src="https://blog.bi-geek.com/wp-content/uploads/2018/06/Arquitectura-Spark-SQL.png" width="500">
</p>
<p align="center">Spark SQL architecture</p>

Comme on peut le voir sur le graphe ci-dessus, Spark SQL contient Catalyst Optimizer qui permet de davantage optimiser les calculs mais aussi de proposer aux développeurs de créer eux-mêmes des fonctions pour optimiser les résultats. Il y a également DataFrame Api. En effet les informations renvoyées suite à la requête SQL de l’utilisateur le sont sous forme de DataFrame, qui est lui-même une forme de Data set. Cela ressemble à une table car une DataFrame est un ensemble de données rangées par colonnes, elle-même nommées. Cependant elles sont davantage optimisées que les tables et permettent davantage de libertés. Un des points importants du Big Data est la variété des données à traiter, une DataFrame permet de stocker des informations venant de diverses sources et sous divers formats.

### B3. Solutions retenues

description technique des solutions choisies (X et Y). Pour chaque solution retenue (une solution par équipe de l’alliance), indiquer l’équipe qui prend en charge et fournir une description technique synthétique.

### B4. Liste de métriques

liste de métriques permettant de comparer (benchmarker) les solutions choisies tout particulièrement sur les facteurs retenus en conclusion de la partie A. Dans la partie A6, des métriques ont pu être pré-sélectionnées. Il s’agit dans cette partie B4 de s’interroger sur la faisabilité de la mesure des métriques et pour celles qui seront retenues (de l’ordre de 3) de décrire dans le détail la procédure de mesure.

- Métrique 1 : Quantité de RAM utilisée
  En lien avec la sous-caractéristique 1 (Efficacité en ressources), on mesurera la quantité de RAM consommée par chaque solution afin d'en faire un benchmark. La solution nécessitant le moins de RAM sera donc la plus intéressante pour ce sous-facteur. Un outil tel que htop permet de faire ce genre de mesure.

- Métrique 2 : Qualité générale du code
  En vue d'utiliser une solution technique facilement maintenable et adaptable, nous réaliserons un benchmark sur la qualité globale des implémentation des solutions. Nous pourrons ainsi mesurer la complexité moyenne du code ainsi que la longueur moyenne des fonctions... Pour cela nous pourrons utiliser des outils comme flake8 pour python ou CheckStyle pour Java.

- Métrique 3 : Nombre de tweets traités par seconde
  Dans l'optique de choisir la solution technique offrant la meilleure efficacité, nous mesurerons le temps moyen nécessaire au traitement de tweets par les différentes solutions sur une même machine, afin d'obtenir des mesures comparables. Ceci nous permettra donc de calculer le nombre de tweets pouvant être traités par seconde en fonction des logiciels selectionnés. Celui offrant le meilleur taux sera le plus intéressant pour ce sous-facteur.

### B5. Découpage (WBS) pour réalisation des prototypes

découpage en tâches (Work Breakdown Structure) montrant comment vous allez parvenir à réaliser cinq prototypes.

## Partie C

### C1. Architecture solution W

### C2. Architecture solution X

### C3. Architecture solution Y

### C4. Architecture solution Z
