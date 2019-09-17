FROM openjdk:8-jdk-alpine
ADD target/huaweitest-0.0.1-SNAPSHOT.war /app.jar
ENTRYPOINT java -jar /app.jar
