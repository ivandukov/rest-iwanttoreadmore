FROM openjdk:21-jdk-alpine

WORKDIR /app

COPY build.gradle settings.gradle /app/

COPY gradlew /app/
COPY gradle /app/gradle

RUN ./gradlew build || return 0

COPY src /app/src

EXPOSE 8080

ENTRYPOINT ["./gradlew", "bootRun"]
