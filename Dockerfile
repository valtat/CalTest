FROM ubuntu:latest
LABEL authors="valerio"
WORKDIR /App
RUN apt-get update && apt-get install -y maven openjdk-17-jdk
COPY pom.xml /App/
COPY . /App/
RUN mvn package
CMD ["java", "-jar", "target/inclasscal.jar"]
ENTRYPOINT ["java", "-jar", "target/inclasscal.jar"]