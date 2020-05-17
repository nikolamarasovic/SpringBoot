FROM java:8
WORKDIR /target
ADD app-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080