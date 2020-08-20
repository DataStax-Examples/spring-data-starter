# Spring Data Cassandra REST API

This sample uses Spring Data Cassandra and DataStax Astra to build a REST API for a backend service that interacts with products in orders.

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/DataStax-Examples/spring-data-starter)

## Setup

Create a database in [DataStax Astra](https://astra.datastax.com/) with the keyspace name: **spring_data_starter**

## Running

```
export ASTRA_DB_BUNDLE=<path-to-secure-connect-bundle>
export ASTRA_DB_USERNAME=<astra-username>
export ASTRA_DB_PASSWORD=<astra-password>
```

```
mvn package
```

```
java -jar target/spring-data-example-1.0.0-SNAPSHOT.jar
```


## API

After starting the app, go to this link in a browser: http://localhost:8081/swagger-ui/

![Swagger](https://github.com/DataStax-Examples/spring-data-starter/blob/master/doc/pics/spring-data-swagger-ui.png?raw=true)


![Cassandra Spring](https://github.com/DataStax-Examples/spring-data-starter/blob/master/doc/pics/cassandra-spring.png?raw=true)
