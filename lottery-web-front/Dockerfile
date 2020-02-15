FROM openjdk:8
RUN mkdir /usr/src/lottery-web-front
COPY target/lottery-web-front-0.0.1-SNAPSHOT.jar /usr/src/lottery-web-front
WORKDIR /usr/src/lottery-web-front
CMD ["java","-jar" , "lottery-web-front-0.0.1-SNAPSHOT.jar"]


# mvn clean package

#docker build -t lottery-web-front .