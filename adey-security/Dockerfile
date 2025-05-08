# Use an official JDK runtime as a parent image
FROM openjdk:17-jdk-alpine
  
  # Set the working directory inside the container
WORKDIR /app
  
  # Copy the jar file into the container
COPY *.jar app.jar
  
  # Expose the port your Spring Boot app runs on (default 8080)
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
# 192.168.64.7
