FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/*.jar cicd.jar

EXPOSE 80

CMD ["java", "-jar", "cicd.jar", "--server.port=80"]