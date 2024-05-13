FROM amazoncorretto:17.0.11-al2023
WORKDIR /app
COPY build/libs/*.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
