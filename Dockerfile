FROM azul/zulu-openjdk-alpine:8
RUN cp -a **/*.jar /
EXPOSE 8080