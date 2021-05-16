# SpringCloud-Final-Project 👋

****

## Principe du projet :

C'est un projet final de matière Programmation par composant2, qui a pour but de gérer une bibliothèque, pour permettre aux utilisateur d'empreinter des livres selon des règles précises
Ces peuvent-être  enfant, adolescent ou adule ( 3 Cathégories ).

****

#### Règles de gestion :
* Les utilisateurs sont catégorisés par leur age Enfant < 13, 13 < Ado < 18, 18 < Adulte
* Un utilisateur ne peut emprunter que 3 livres maximum
* Un enfant ne peut pas emprunter un livre "ado" ou "adulte"
* Un ado ne peut pas enprunter un livre "adulte"

****

#### Lunch Database:

Pour générer la base de données mettez vous à la racine du projet et entrez cette commande :
docker-compose up -d

****

#### Architecture du projet :

le projet est réalisé en appliquant l'architecture des micro-service avec Cloud, exposent le fonctionnel de l’application au travers d’un Webflux pour remplacer l'API Servlet et créer des endpoints compatibles avec Reactor, afin d'utiliser le paradigme de programmation réactive

Ce projet est divisé comme suit:
* Module Admin 
* Module Config
* Module Book
* Module Comment
* Module User
* Module Gateway
* Dossier Base de donnée 

****


## Les API

Pour chaque micro-service User, Book et Comment, vous pouvez récupérer tous les donnés, les ajouter, les supprimer ou les modifier.

* Récupérer: getAll

* Recherche: findByTitle (pour Book et Comment) ainsi que findByName (pour User)

* Ajouter: save

* Modifier: update

* Supprimer:  deleteById

*****

## Réalisé par
- [Lamya Rayess](https://github.com/lamya-rey)
- [Ahlem Fahem](https://github.com/Ahlem-fahem)
- [Abdellah abouhanifa] (https://github.com/abouhanifa)

