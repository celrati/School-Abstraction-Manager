FROM openjdk:11

 # Refer to Maven build -> finalName
ARG JAR_FILE=./target/courses-service-0.0.1-SNAPSHOT.jar
RUN echo $(ls)
 # cd /opt/app
WORKDIR /opt/app

 # cp target/{jarfileName}.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar

 # java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]