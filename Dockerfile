FROM eclipse-temurin:21-jre

WORKDIR /app

COPY app/build/libs/app-all.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]