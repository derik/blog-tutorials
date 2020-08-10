FROM openjdk:14-buster
MAINTAINER Derik Lima <me@deriklima.com>

ENTRYPOINT ["java", "-jar", "/usr/share/demo-docker-maven/demo.jar"]

ADD target/lib /usr/share/demo-docker-maven/lib

ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/demo-docker-maven/demo.jar