FROM openjdk:11
ADD target/docker-spring-boot-eks.jar docker-spring-boot-eks.jar
ENTRYPOINT ["java", "-jar", "docker-spring-boot-eks.jar"]