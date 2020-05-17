FROM java:8
WORKDIR /target
RUN cp -a /app-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080