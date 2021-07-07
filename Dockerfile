FROM openjdk:8-jdk-alpine
WORKDIR /tmp
ADD target/*.jar kube-sample.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -jar /tmp/kube-sample.jar"]