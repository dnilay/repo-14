FROM openjdk:8
EXPOSE 8080
ADD target/book-service.jar book-service.jar
ENTRYPOINT ["java","-jar","/book-service.jar"]