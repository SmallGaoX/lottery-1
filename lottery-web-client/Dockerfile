FROM openjdk:8
RUN mkdir /usr/src/lottery-web-client
COPY target/lottery-web-client-0.0.1-SNAPSHOT.jar /usr/src/lottery-web-client
WORKDIR /usr/src/lottery-web-client
CMD ["java","-jar" , "lottery-web-client-0.0.1-SNAPSHOT.jar"]


# mvn clean package

#docker build -t lottery-web-client .