FROM azul/zulu-openjdk-alpine:8
CMD ls
RUN cp -a **/*.jar / 
EXPOSE 8080