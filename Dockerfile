FROM java:8
RUN cp -a  **/*.jar app.jar
EXPOSE 8080