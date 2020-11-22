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
Le flux que nous anlyserons est un flux de tweets de jeunes diplomés dont il faudra déterminer la tendance, positive ou négative.

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
* Permettre d’optimiser le temps de réponse pour chaque tâche
* Éviter de surcharger de manière inégale les ordinateurs de la grappe lors de l'excecution d'une tâche. 

##### <em>HPC cluster</em>
Les grappes de calcul (<em> High-performance computing cluster</em>) désginent les grappes qui utilisent des supercalculateurs pour réaliser leurs tâches.

##### <em>Grid computing</em>
Une grille de calcul (<em>Grid computing</em>) est une infrastructure virtuelle (relations logiques entre les entités qui la composent) constituée d'un ensemble de ressources informatiques partagées, distribuées, hétérogènes, délocalisées et autonomes.

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
  * What technology you need to manage it
  * The key success factors in implementing any big data project

- <strong>Analytics in a Big Data World: The Essential Guide to Data Science and its Applications </strong> - Bart Baesens - 2014
  * Chapter 3 -  Predictive Analytics
  * Chapter 6 -  Social Network Analytics
  * Chapter 8    Example Applications => Social Media Analytics

- <strong>Sentiment Analysis: Mining Opinions, Sentiments, and Emotions</strong> -  Bing Liu - 2015
  * Chapters  3–9  


### A4. Acteurs

#### 1. Apache Software Foundation
est une organisation à but non-lucrative développant des logiciels open-source sous la licence Apache. 
Si de nombreux projets sont sous licence Apache, pas seulement en matière de Big Data, on peut malgré tout noter que les frameworks les plus utilisés et reconnus sont sous cette licence.
En effet Hadoop, un des framework les plus connus pour le traitement de grandes quantités d’informations, est sous licence Apache depuis 2012. Hadoop est lui même composé de plusieurs modules à savoir : Hadoop Common, Hadoop Distributed File System (HDFS), Hadoop Yarn, Hadoop MapReduce. Tous ces modules fonctionnent ensemble et peuvent être couplés avec d’autres framework de l’environnement comme Hive, permettant d’éviter un traitement avec du Map Reduce en passant par du HQL, un langage très similaire au SQL. 
Hadoop n’est pas le seul à faire partie de la fondation Apache puisque l’on retrouve aussi Spark, produisant de l’analyse de données plus rapidement qu’Hadoop. 
Kafka, Hive ou encore Flink sont tous passés sous cette licence après leur création. Les projets sont donc ainsi tous open-source et bénéficient d’un nombre important de contributeurs. Parmi ceux-ci l’on retrouve les entreprises les plus influentes en matière de Big Data tel que Yahoo (premier créateur d’Hadoop), Google (créateur du MapReduce), IBM, Linkedin ou encore Facebook. 

#### 2. Google 
a crée en 2004 MapReduce, un modèle de programmation utilisé pour traiter de gros flux de données. Si aujourd’hui MapReduce est de plus en plus délaissé, il a permis à Hadoop d’émerger  et ainsi de mettre en lumière le calcul distribué et parallèle. L’enjeu est très important puisqu’à mesure qu’internet se développe, de plus en plus de données doivent être traitées. A titre d’exemple Facebook génère 4 Pétaoctets de nouvelle données chaque jour. Ainsi si toutes ces données doivent être analysées en un temps raisonnable, les algorithmes classiques ne le permettent pas. Map Reduce propose de diviser le problème en de nombreux sous-problèmes, indépendants les uns des autres, et d’ensuite tout rassembler. Chaque sous problème est traiter sur une machine indépendante, permettant le calcul parallèle et distribué. L’exemple le plus connu de Map Reduce est le word count, consistant à compter le nombre d’occurrences des mots dans un texte. Pour ce faire chaque ligne est séparée puis à chaque mot d’une ligne est attribué le nombre. Les données sont ensuite triées afin d’avoir les mots identiques ensemble. Finalement le nombre d’occurrences est ajouté (cf exemple si dessous). On peut retrouver un livre blanc de Google sur le sujet du Map Reduce qui détaille l’utilisation de Map Reduce sur un nombre important de machines. 

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

Le design pattern en adéquation avec ce sujet est le *Real-time streaming pattern*

Les différents objectifs de ce pattern sont :
La minimisation du temps de traitement des informations
Le traitement des évènements au travers d’unités indépendantes les unes des autres.
Le support de l’échec du traitement des informations

Comme chaque tweet est traité séparément, et les unités de traitement indépendantes du support,  il est possible d’établir une architecture scalable, que ce soit horizontalement ou verticalement. Ce pattern est donc adapté à la lecture de tweets en temps réel.

Cela permet aussi de rendre le système résilient et de résister aux échecs. Ainsi la stabilité du programme est maintenue à tout moment.

Ce pattern peut être implémenté grâce à plusieurs frameworks tels que akka (Java) ou avec le langage Scala, qui utilise le paradigme acteur.


Chaque acteur peut-être associé à une unité de traitement, indépendante des autres. L’utilisation du framework permet une utilisation plus simple car il gère seul la durée de vie et de mort des acteurs et cela à la fin d’une tâche ou quand une erreur se produit.

Dans “Clean architecture” de Robert Martin, on trouve un catalogue de design patterns de Big Data. On y trouve différents patterns en adéquation avec notre sujet : 

#### Exception : 
Ce pattern permet notamment une meilleure prévision des exceptions dans le code.  De plus, il instaure un système de logs pour plus de facilité à gérer les anomalies.

L’importance de ce pattern réside dans le fait que potentiellement chaque donnée peut être mal traitée et donc faire échouer le programme. Ce pattern nous incite à séparer les différentes étapes du traitement, en effet avoir une distinction précise entre chaque traitement permet d’avoir une meilleure lisibilité, interprétabilité, et de rendre le traitement plus facilement debuggable.
Les différentes étapes peuvent être :
* Obtention des données
* Pré-traitement des données (Normalisation)
* Sauvegarde 
* Processus principal (comptage des mots positifs/négatifs dans notre cas)
* Livraison des données

Les données peuvent être livrées sous plusieurs formes. On pense notamment au stockage dans une ou plusieures bases de données bien qu’elles puissent également être copiées sur plusieurs supports afin de pérenniser les données.


## Partie B

### B1. Approche technique
texte de 2 à 3 pages qui montre les principales caractéristiques des approches techniques sur le sujet (on utilisera de manière privilégiée les patterns pour étayer la description).

Quatre types de pattern ressortent lorsque l'on s'interesse à une application traitant un flot continu (Streaming) de données. Ici nous écarterons délibérément le dernier pattern, Data Security, puisque ce n'est pas un facteur qualité que nous avons choisi de traiter en priorité.

####  a. Streaming-Architecture Pattern

Le traitement et l'analyse de données en temps reel est un problème qui est abordé dans la plupart des cas en adoptant l'une des trois principales architectures : Real-Time Streaming Architecture, Lambda Architecture et Kappa Architecture. L'architecture de streaming étant un ensemble définis de composants en intéraction mutuelle dans le but d'effectuer une série d'actions/taitement sur une série non bornée de données au moment de leur création.

##### Real-Time Streaming Architecture
<p align="center">
 <img src="https://github.com/prodageo/mniproj2020b-2020a30a/blob/master/docs/img/NortonWorks_RealTimeStreaming_Architecture.png" width="600">
</p>
<p align="center">Real-Time Streaming Architecture (NortonWorks)</p>

##### Lambda Architecture

Conçue pour effectuer en simultané un traitement de type batch tout en ayant un flot d'entré continu, l'architecture Lambda se découpe en trois couches.

<p align="center">
<img src="https://github.com/prodageo/mniproj2020b-2020a30a/blob/master/docs/img/NortonWorks_Lambda_Architecture.png" width="600">
</p>
<p align="center">Lambda Architecture (NortonWorks)</p>

La couche de Batch, stock les données pour effectuer un traitement réguliers. La couche de temps réel (SpeedLayer), possede deux rôles, elle traite les données pour calcule les vues incrémentales destinées fournir des données récentes aux vues de batch et elle supprime les vues obsolètes. Enfin la couche de service stock est expose les vues precedement créées.

L'avantage de l'architecture Lambda est la possibilité d'utiliser Hadoop pour stocker et traiter de grands dataset lors des analyses a posteriori (peu utile dans notre cas).

##### Kappa Architecture

Proposée apres l'architecture Lambda, . Une serie de données est en premier lieu stockée dans une messaging engine (Apache ou Kafka) qui lit, formate les données et les stocks dans une base de données disponible pour le traitement final. L'architecture Kappa fait office d'alternative simplifiée à l'architecture Lambda, puisque les deux architecture utilisent le même ensemble de technnologies mais Kappa se démarque par le fait que les données sont considérées comme un flot, la partie de traitement par flot de Kappa est ainsi la seule partie de transformation des données.

<p align="center">
<img src="https://github.com/prodageo/mniproj2020b-2020a30a/blob/master/docs/img/NortonWorks_Kappa_Architecture.png" width="600">
 </p>
<p align="center">Kappa Architecture (NortonWorks)</p>

L'avantage de Kappa par rapport à l'architecture Lambda et la possibilité de construire  une application de traitement en ayant la possibilité de modifier son code 

#### b. Functional Patterns

##### Stream Joins

#### c. Data Management Patterns

##### 1) External Lookup

Rapide et Dynamique, l'external Lookup minimise le temps de traitement et le risque d'un bloquage du flot de données sur un composant du system tout en maintenant un rendement de sortie élevé.

##### 2) Responsive Shuffling
Ajustement automatique de la répartition des données pour de meilleures performances lors de pic d'activité tout en variant le biais des données.

##### 3) Out-Of-Sequence Events

#### c. Techniques

##### Micro-Batching
Afin de traiter un flot continu de données, Hadoop utilise le concept de micro-batching consistant à subdiviser le flot entrant en partitions puis envoyé à un system de traitement par batch. Une telle approche introduit une latence sur le traitement.

##### HDFS

##### MapReduce
Executé en 3 étapes (Map, Shuffle, Reduce), MapReduce est un model de programmation permettant le traitement grands ensemble de donnée.
- <strong>Map</strong>:
Les données en entrée sont partitionnées pour que ces nouveaux échantillons soient envoyé à un programme appliquant la fonction de mapping. La fonction de mapping produit des paires (clé, valeur).
- <strong>Shuffle</strong>:
Les paires (clé, valeur) sont regroupé par clé et chaque groupe est envoyé à la partie de Réduction correspondante.

##### Yarn

##### Kafka
Rôle d'aggregation des flots de données.

##### Stream processing engine

###### Hazelcast Jet

### B2. Solutions technologiques concurrentes
 liste des solutions technologiques concurrentes mettant en œuvre une des approches techniques (de manière plus ou moins explicite), et parmi cette liste, le choix de deux solutions technologies Y et Z pour prototypage. Pour les solutions choisies, assurez-vous que vous êtes bien en mesure de les mettre en œuvre (prérequis accessibles, licences d’évaluation disponibles en cas de modèle payant, …).
 
 - hadoop => Cassandre
 - hive (solution implémentée par le groupe E02) => Cassandre
 - spark sql => David
 - spark streaming => David
 - flink => Zoé
 - storm => Zoé
 
### B3. Solutions retenues
description technique des solutions choisies (X et Y). Pour chaque solution retenue (une solution par équipe de l’alliance), indiquer l’équipe qui prend en charge et fournir une description technique synthétique.

### B4. Liste de métriques
 liste de métriques permettant de comparer (benchmarker) les solutions choisies tout particulièrement sur les facteurs retenus en conclusion de la partie A. Dans la partie A6, des métriques ont pu être pré-sélectionnées. Il s’agit dans cette partie B4 de s’interroger sur la faisabilité de la mesure des métriques et pour celles qui seront retenues (de l’ordre de 3) de décrire dans le détail la procédure de mesure.

### B5. Découpage (WBS) pour réalisation des prototypes
découpage en tâches (Work Breakdown Structure) montrant comment vous allez parvenir à réaliser cinq prototypes.

## Partie C

### C1. Architecture solution W

### C2. Architecture solution X

### C3. Architecture solution Y

### C4. Architecture solution Z
