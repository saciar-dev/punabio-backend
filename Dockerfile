FROM openjdk:17-jdk-slim

COPY target/punabioApp-0.0.1-SNAPSHOT.jar punabio-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "punabio-app.jar"]