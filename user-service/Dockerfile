FROM openjdk:8-jdk-alpine
EXPOSE 8081
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:/app/lib/*","com.dockr.training.UserServiceApplication"]
#ADD target/*.jar app.jar
#ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]
