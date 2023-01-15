FROM maven:3.8.7-openjdk-18
WORKDIR /
COPY src /src
COPY pom.xml /
COPY src/test/resources/testng.xml /