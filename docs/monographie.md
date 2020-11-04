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
   - <strong> E14 - {Nom équipe 3} </strong>
     - Germain, Louis (lgermainINSA)
     - Lenoir, Louis ({pseudo Github membre 2-1})
     - Zeghib, Amin ({pseudo Github membre 2-1})
   - <strong> E02 - CasimentPasDIdee </strong>
     - Abecassis, Zoé (zabecassis)
     - Lesseure, Cassandre (cleseurre)
     - Quéré, David (DavidQuere)

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

#BigData #DataAnalysis #Tweet #MachineLearning #Traitement #Stockage #TextMining #NLP #Trend #OpinionMining

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
