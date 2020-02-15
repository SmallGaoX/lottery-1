FROM openjdk:8
RUN mkdir /usr/src/lottery-admin
COPY target/lottery-admin-0.0.1-SNAPSHOT.jar /usr/src/lottery-admin
WORKDIR /usr/src/lottery-admin
CMD ["java","-jar" , "lottery-admin-0.0.1-SNAPSHOT.jar"]


# mvn clean package

#docker build -t lottery-admin-front .