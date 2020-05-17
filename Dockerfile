FROM azul/zulu-openjdk-alpine:8

ADD target/app-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD java -jar app.jar