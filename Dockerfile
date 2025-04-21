# Base image - Java 17
FROM openjdk:17-jdk-slim

# App install aagura folder
WORKDIR /app

# build aana jar file copy pannuvom
COPY target/*.jar app.jar
EXPOSE 8080

# App run panna solrathu
ENTRYPOINT ["java", "-jar", "app.jar"]

