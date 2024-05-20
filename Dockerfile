FROM openjdk:17
EXPOSE 8080
ADD target/springboot-github-images.jar springboot-github-images.jar
ENTRYPOINT ["java", "-jar", "/springboot-github-images.jar"]
