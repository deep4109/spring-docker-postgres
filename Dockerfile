FROM openjdk:24-slim-bullseye
LABEL authors="Deepak"
ADD target/docker-postgres-app.jar docker-postgres-app.jar
ENTRYPOINT ["java", "-jar","/docker-postgres-app.jar"]

