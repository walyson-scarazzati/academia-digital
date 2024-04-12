# Use a base image with Maven to build the application
FROM maven:3.8.5-openjdk-11 AS build
WORKDIR /app
COPY ../pom.xml .
COPY ../src ./src
RUN mvn clean package -DskipTests

# Use a lighter base image for the application runtime
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/academia-digital-0.0.1-SNAPSHOT.jar app.jar

# Expose the port on which the Spring Boot application will run
EXPOSE 8080

# Command to run the Spring Boot application
CMD ["java","-Dspring.profiles.active=docker", "-jar", "app.jar"]
