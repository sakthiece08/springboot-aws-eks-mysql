FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "/app.jar"]