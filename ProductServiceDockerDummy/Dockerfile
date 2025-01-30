# Stage 1: Build Stage
FROM maven:3.8.5-openjdk-17-slim AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and download dependencies (to cache dependencies)
COPY pom.xml .

# Download Maven dependencies to cache them
RUN mvn dependency:go-offline -B

# Copy the source code to the container
COPY src /app/src

# Package the Spring Boot application as a jar
RUN mvn clean package -DskipTests

# Stage 2: Runtime Stage
FROM openjdk:17-jdk-slim AS runtime

# Set the working directory for the runtime container
WORKDIR /app

# Copy the jar file from the build stage to the runtime stage
COPY --from=build /app/target/*.jar /app/ProductServiceDockerDummy.jar

# Expose the port the application will run on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app/ProductServiceDockerDummy.jar"]