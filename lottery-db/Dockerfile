FROM mysql/mysql-server:8.0
RUN mkdir /usr/src/lottery-db
COPY lottery.sql /usr/src/lottery-db

# mvn clean package

#docker build -t lottery-db .

#docker run  --name lottery-db -p 3306:3306  -e MYSQL_ROOT_PASSWORD=root2019 mysql/mysql-server:8.0

# client
# docker run -it --network some-network --rm mysql mysql -hsome-mysql -uexample-user -p
# docker run -it --network b33d82e9c384 --rm mysql mysql -hlottery-db -uroot -p