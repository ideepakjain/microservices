first complete order-service steps then

mvn clean package install -DskipTests

docker container run -d -p 8082:8082 --name=orders-service --network=mysql-net -e JAEGER_SERVICE_URI=http://jaeger deepakjain01/orders-service:latest

