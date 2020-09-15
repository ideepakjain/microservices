first complete user-service steps then orders-service steps then below 

mvn clean package install -DskipTests

docker container run -d -p 8080:8080 --name=aggregator-service --network=mysql-net --env USER_SERVICE_URI=http://user-service:8081 --env ORDERS_SERVICE_URI=http://orders-service:8082 -e JAEGER_QUERY_API_URL=http://jaeger -e JAEGER_COLLECTOR_API_URL=http://jaeger deepakjain01/aggregator-service:latest

