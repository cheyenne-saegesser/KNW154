FROM openjdk:17-alpine3.14 
#openjdk:17.0.2

MAINTAINER Cheyenne "cheyenne.saegesser@bbzbl-it.ch"

EXPOSE 7070

#Pfad wo das Docker Image hin soll
WORKDIR /usr/local/bin 

COPY ./target/154-crm-web-0.0.1-SNAPSHOT.jar 154-crm-web.jar

CMD ["java", "-jar", "crm-web.jar"]