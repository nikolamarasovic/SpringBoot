FROM azul/zulu-openjdk-alpine:8
COPY .mvn/wrapper/*.jar app.jar
EXPOSE 8080
CMD cd target
CMD java -jar app.jar