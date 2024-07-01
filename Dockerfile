FROM openjdk:8-jdk-alpine

WORKDIR /app

EXPOSE 9090

ADD target/demo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
