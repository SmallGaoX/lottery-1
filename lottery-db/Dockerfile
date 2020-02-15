FROM mysql:8
RUN mkdir /usr/src/lottery-db
COPY lottery.sql /usr/src/lottery-db

EXPOSE 3305

# mvn clean package

#docker build -t lottery-web-front .

#docker run -it -p 3305:3305  -e MYSQL_ROOT_PASSWORD=root2019 lottery-db