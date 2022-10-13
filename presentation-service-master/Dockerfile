FROM openjdk:17
COPY target/presentation-service-0.0.1-SNAPSHOT.jar presentationservicemaster.jar
EXPOSE 8082
ENTRYPOINT exec java $JAVA_OPTS -jar presentationservicemaster.jar
