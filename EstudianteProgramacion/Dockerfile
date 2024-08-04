FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/EstudianteProgramacion-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app_est_prog.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app_est_prog.jar"]