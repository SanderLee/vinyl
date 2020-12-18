FROM gradle:latest as builder

WORKDIR /app
COPY build.gradle.kts .
COPY settings.gradle.kts .
COPY src ./src

RUN gradle build

FROM openjdk:15-jdk-alpine

COPY --from=builder /app/build/libs/vinyl-*.jar /vinyl.jar

CMD ["java","-jar","/vinyl.jar"]