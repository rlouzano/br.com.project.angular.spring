FROM openjdk:11.0.15

ADD target/crud_angular_spring-0.0.1-SNAPSHOT.war app.war

ENTRYPOINT ["java", "-jar", "/app.war"]

EXPOSE 8080