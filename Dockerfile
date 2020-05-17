FROM java:8
WORKDIR /target
ADD /*.jar app.jar
EXPOSE 8080