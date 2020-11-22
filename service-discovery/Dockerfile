FROM openjdk
COPY ./target/service-discovery-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "service-discovery-0.0.1-SNAPSHOT.jar"]