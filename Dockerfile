FROM openjdk:17-jdk-alpine
EXPOSE 8080
RUN set -ex; mkdir payroll-application
WORKDIR /payroll-application
COPY ./target/payroll-application-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar","app.jar"]