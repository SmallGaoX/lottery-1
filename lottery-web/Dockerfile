FROM openjdk:8
RUN mkdir /usr/src/lottery-web
COPY target/lottery-web-0.0.1-SNAPSHOT.jar /usr/src/lottery-web
WORKDIR /usr/src/lottery-web
CMD ["java","-jar" , "lottery-web-0.0.1-SNAPSHOT.jar"]


# mvn clean package

#docker build -t lottery-web .