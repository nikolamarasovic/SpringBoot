FROM azul/zulu-openjdk-alpine:8
RUN pwd
RUN cd C:/Users/enimara/Downloads/app/app_new/

RUN cp -a target/app-0.0.1-SNAPSHOT.jar app.jar