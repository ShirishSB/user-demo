FROM openjdk:17-jdk-slim

# Set working directory inside container
WORKDIR /app

# Copy the built JAR to the container
COPY target/docker-0.0.1-SNAPSHOT.jar dockerdemo.jar

# Expose port (match Spring Boot app)
EXPOSE 8080

# Command to run the JAR
ENTRYPOINT ["java", "-jar", "dockerdemo.jar"]