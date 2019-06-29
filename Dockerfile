FROM openjdk:8-jdk-alpine

LABEL maintainer="sanjaya.rusli@gmail.com"

EXPOSE 8080

ARG JAR_FILE=target/spring-boot-sample-1.0-SNAPSHOT.jar

ADD ${JAR_FILE} app.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/app.jar"]

