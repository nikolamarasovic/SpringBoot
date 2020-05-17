FROM tomcat:8.0
RUN cp -a **/*jar /
EXPOSE 8080
CMD ["catalina.sh", "run"]