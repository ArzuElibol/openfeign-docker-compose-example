FROM openjdk:17
COPY target/calculation-service-0.0.1-SNAPSHOT.jar calculationservicemaster.jar
EXPOSE 8081
ENTRYPOINT exec java $JAVA_OPTS -jar calculationservicemaster.jar
