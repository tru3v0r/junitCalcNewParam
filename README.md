Ce projet permet de tester l'injection de paramètres avec Squash Autom/DevOps dans un 
projet automatisé avec JUnit.

Les tests disponibles sont les suivants :

* testScopePrem : Récupération de tous les paramètres locaux possibles et vérification des valeurs.

* testScopeCommu : Récupération des paramètres locaux au niveau du cas de test et des jeux de données puis vérification des valeurs.

* allScope : Récupération des paramètres (locaux et globaux) au niveau du cas de test et des jeux de données puis vérification des valeurs.

* globalScope : Récupération des paramètres globaux au niveau du cas de test et des jeux de données puis vérification des valeurs.

Ces mêmes tests existent avec les valeurs incluses par défaut (voir la classe DefaultParameterTest).

Liste des paramètres attendus pour un test en succès : 

* TC_CUF_testcase : 50

* IT_CUF_iteration : iterationValue

* TS_CUF_testsuite : 62.35f

* CPG_CUF_campaign : 1.25

* DSNAME : true

* DS_param : true

Exceptions testables :

* ParameterNotFoundException : Prendre n'importe quelle méthode et ne pas renseigner de TC_CUF.

* ParameterFormatException :  Prendre n'importe quelle méthode et renseigner les TC_CUF avec autre chose qu'un integer.
