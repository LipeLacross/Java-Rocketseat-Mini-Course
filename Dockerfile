# Use a Maven image with JDK 17 from Render's Docker Hub
FROM render/worker:java-17-maven AS builder

WORKDIR /app

# Copy the pom.xml and install dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the source code and build the project
COPY src /app/src
RUN mvn clean install -DskipTests

# Use a smaller JDK image for the final stage
FROM render/worker:java-17

WORKDIR /app
COPY --from=builder /app/target/*.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]
