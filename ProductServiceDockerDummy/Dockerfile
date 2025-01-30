FROM openjdk:17-jdk-slim

COPY target/ProductServiceDockerDummy-0.0.1-SNAPSHOT.jar /app/ProductServiceDockerDummy.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/ProductServiceDockerDummy.jar"]