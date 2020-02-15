FROM openjdk:8
RUN mkdir /usr/src/lottery-eureka-server
COPY target/lottery-eureka-server-0.0.1-SNAPSHOT.jar /usr/src/lottery-eureka-server
WORKDIR /usr/src/lottery-eureka-server
CMD ["java","-jar" , "lottery-eureka-server-0.0.1-SNAPSHOT.jar"]


# mvn clean package

#docker build -t lottery-eureka-server .