FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} patient-management.jar
ENTRYPOINT ["java", "-jar", "/patient-management.jar"]
EXPOSE 9013