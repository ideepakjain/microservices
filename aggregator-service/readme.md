first complete order-service steps then orders-service steps then below 

mvn clean package install -DskipTests

docker container run -d -p 8080:8080 --name=aggregator-service --network=mysql-net --env USER_SERVICE_URI=http://user-service:8081 --env ORDERS_SERVICE_URI=http://orders-service:8082   deepakjain01/aggregator-service:latest

