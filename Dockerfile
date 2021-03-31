FROM openjdk:latest

ADD target/spring-boot-maven-plugin.jar spring-boot-maven-plugin.jar

EXPOSE 8085

ENTRYPOINT ["java","-jar","spring-boot-maven-plugin.jar"]





