FROM openjdk:8-jdk-alpine
COPY target/springboot-external-property-openshift-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8080