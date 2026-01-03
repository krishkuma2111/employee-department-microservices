FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8081
EXPOSE 8082
EXPOSE 8083
EXPOSE 8761
EXPOSE 8888

ENTRYPOINT ["java","-jar","/app/app.jar"]
