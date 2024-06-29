FROM openjdk:8-jdk-alpine

WORKDIR /app

EXPOSE 9090

ADD target/your-app-name.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
