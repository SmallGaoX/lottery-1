FROM openjdk:8
RUN mkdir /usr/src/lottery-api
COPY target/lottery-api-0.0.1-SNAPSHOT.jar /usr/src/lottery-api
WORKDIR /usr/src/lottery-api
CMD ["java","-jar" , "lottery-api-0.0.1-SNAPSHOT.jar"]


# mvn clean package

#docker build -t lottery-api .