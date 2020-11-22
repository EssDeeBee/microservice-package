FROM openjdk
COPY ./target/business-api-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "business-api-0.0.1-SNAPSHOT.jar"]