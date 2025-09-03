FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
WORKDIR /app
COPY . .

RUN apt-get install maven -y
RUN mvn clean install


FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/gestao_vagas-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080


ENTRYPOINT ["java", "-jar", "app.jar"]