# manager-api
# API REST de gestion de fiches clients

Cette API REST en Java Spring Boot permet de gérer les fiches clients. Elle utilise une base de données MySQL pour stocker les informations des clients.

## Dépendances

Pour exécuter cette API, vous devez avoir les dépendances suivantes installées :

- Java JDK (version 17.X.X)
- Maven (version 3.8.X)
- MySQL (version 5.X.X)

## Configuration de la base de données

Avant de lancer l'API, assurez-vous de configurer les informations de connexion à la base de données MySQL. Vous pouvez trouver le fichier de configuration dans le répertoire `src/main/resources/application.properties`. Modifiez les propriétés suivantes selon votre configuration :

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mbd
spring.datasource.username=root
spring.datasource.password=
server.port = 8081
```

**Installation et exécution**

1. Élément de listeClonez ce dépôt de code sur votre machine ou téléchargez-le sous forme d'archive ZIP.
2. Élément de listeOuvrez une fenêtre de commande et accédez au répertoire racine de l'API.
3. Exécutez la commande suivante pour compiler le projet :
```mvn clean install```
4. Ensuite, lancez l'API en exécutant la commande suivante :
```mvn spring-boot:run```
L'API sera accessible à l'adresse http://localhost:8081.

**Utilisation de l'API**
Cette API expose les endpoints suivants :

```GET /clients :``` Récupère la liste des clients.
```GET /clients/{id}``` : Récupère les détails d'un client spécifique.
```POST /clients``` : Crée un nouveau client.
```PUT /clients/{id}``` : Met à jour les informations d'un client existant.
```DELETE /clients/{id}``` : Supprime un client.
Assurez-vous d'inclure les en-têtes appropriés lors de l'envoi des requêtes (par exemple, Content-Type: application/json).

**Tests unitaires**
Ce projet inclut des tests unitaires pour garantir le bon fonctionnement de l'API. Vous pouvez exécuter les tests en exécutant la commande suivante :
`mvn test`
