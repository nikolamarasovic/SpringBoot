FROM java:8
ADD **/app-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080