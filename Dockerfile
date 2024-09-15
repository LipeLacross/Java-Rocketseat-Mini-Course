# Use an official Maven image
FROM maven:3.8.6-openjdk-17 AS builder

WORKDIR /app

# Copy the pom.xml and install dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the source code and build the project
COPY src /app/src
RUN mvn clean install -DskipTests

# Use a smaller JDK image for the final stage
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/target/*.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]
