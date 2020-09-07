docker network create mysql-net

docker run -d -e MYSQL_ROOT_PASSWORD=myrootpass -e MYSQL_DATABASE=ordersDB -e MYSQL_USER=myuser -e MYSQL_PASSWORD=mypass -p 3306:3306 --network=mysql-net --name=mysql --volume mysql-db-vol:/var/lib/mysql mysql:5.7

goto project folder user-service , mvn clean package install -DskipTests

docker container run -d -p 8081:8081 --name=user-service --network=mysql-net -e RDS_HOST=mysql deepakjain01/user-service:latest

