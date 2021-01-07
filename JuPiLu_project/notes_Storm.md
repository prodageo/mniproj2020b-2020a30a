# **Notes Storm**

## **Introduction**

Plusieurs noeuds : 
- Noeud maître : **Nimbus**
- Noeuds **superviseurs** ou **workers**
- Noeuds de coordination

Unité de traitement : Spout et Bolts. Le graphe qui est composé de tout ça est appelé une topologie.
- Spout : Sources des données. Fournissent les tuples de données à traiter. 
- Bolts : En charge de traitement tels que des transformations. 

**IMPORTANT :** les topologies sont généralement dans un **.jar** mais d'autres langages que Java sont possibles. 