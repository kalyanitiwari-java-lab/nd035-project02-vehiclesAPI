# nd035-project02-vehiclesAPI
A REST-based Vehicles API that communicates with a location and pricing service using Spring Boot, 
along with converting the existing Pricing Service API to a microservice registered on a Eureka server.

## Tools Required
1. Spring Boot Framework
2. Maven Plug-in configured with your IDE

## How To Run
You can either use these in separate windows in your favorite IDE, or use the below commands:

$ mvn clean package (run this in each directory containing the separate applications)

1.Boogle Maps: 
```
$ java -jar target/boogle-maps-0.0.1-SNAPSHOT.jar
```
2.The service is available by default on port 9191. You can check it on the command line by using 
```
$ curl http://localhost:9191/maps\?lat\=20.0\&lon\=30.0
```
3.Pricing Service: 
  3.a Start Eureka Server before you start Pricing Service
  
    ```
    $ java -jar target/eureka-0.0.1-SNAPSHOT.jar
    ```
    Eureka Server should be available at:
    http://localhost:8761/
  3.b Start Pricing Service
    ```
    $ java -jar target/pricing-service-0.0.1-SNAPSHOT.jar
    ```
    Once the Pricing Service is up and running, you should be able to find it's instance registered in the Eureka registry at
    above given link.
4.Vehicles API: 
```
$ java -jar target/vehicles-api-0.0.1-SNAPSHOT.jar
```
5.When the Swagger API documentation is implemented, it should be available at: 
```
http://localhost:8080/swagger-ui.html
```

## License
This project uses MIT License. Please read [LICENSE](https://github.com/kalyani7t/nd035-project02-vehiclesAPI/blob/master/LICENSE)
under this project before using it.


