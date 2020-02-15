FROM openjdk:8
RUN mkdir /usr/src/lottery-admin-front
COPY target/lottery-admin-front-0.0.1-SNAPSHOT.jar /usr/src/lottery-admin-front
WORKDIR /usr/src/lottery-admin-front
CMD ["java","-jar" , "lottery-admin-front-0.0.1-SNAPSHOT.jar"]


# mvn clean package

#docker build -t lottery-admin-front .