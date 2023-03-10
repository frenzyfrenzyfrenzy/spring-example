FROM arm64v8/tomcat:11.0.0-M4-jdk17-temurin-jammy

COPY target/hibernate-example.war /usr/local/tomcat/webapps

ENV JPDA_ADDRESS=*:8001
ENV JPDA_TRANSPORT=dt_socket
#ENV JPDA_SUSPEND=y

EXPOSE 8080/tcp
EXPOSE 8001/tcp

CMD /usr/local/tomcat/bin/catalina.sh jpda run