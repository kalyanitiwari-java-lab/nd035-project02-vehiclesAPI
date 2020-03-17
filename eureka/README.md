# Eureka server 

Eureka, created by Netflix, is responsible for the registration and discovery microservices. Spring has incorporated Eureka
into Spring Cloud, making it even easier to stand up a Eureka server.

Eureka consists of a server and a client-side component. The server component will be the registry in which all the microservices 
register their availability. The microservices use the Eureka client to register; once the registration is complete, it notifies 
the server of its existence.

## How To Run
1. mvn clean package
2. java -jar target/eureka-0.0.1-SNAPSHOT.jar

## Usage
You can check the Eureka server running at http://localhost:8761/ once the web application is running.
