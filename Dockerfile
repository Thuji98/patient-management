FROM openjdk:11
RUN apt update && apt install tzdata -y
ENV TZ="Asia/Colombo"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} patient-management.jar
ENTRYPOINT ["java", "-jar", "/patient-management.jar"]
EXPOSE 9013