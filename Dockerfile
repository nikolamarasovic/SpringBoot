FROM azul/zulu-openjdk-alpine:8
COPY target/*.jar app.jar
EXPOSE 8080
CMD java -jar app.jar