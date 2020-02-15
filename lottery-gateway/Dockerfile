FROM openjdk:8
RUN mkdir /usr/src/lottery-gateway
COPY target/lottery-gateway-0.0.1-SNAPSHOT.jar /usr/src/lottery-gateway
WORKDIR /usr/src/lottery-gateway
CMD ["java","-jar" , "lottery-gateway-0.0.1-SNAPSHOT.jar"]


# mvn clean package

#docker build -t lottery-gateway .