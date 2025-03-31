FROM openjdk:21-jdk
COPY target/rest-docker.jar /tmp/rest-docker.jar
CMD ["/usr/bin/java", "-jar", "/tmp/rest-docker.jar"]
