FROM openjdk:17-jdk-slim

# Information around who maintains the image
#MAINTAINER x.com

# Add the application jar to the image
COPY target/configserver-0.0.1-SNAPSHOT.jar configserver-0.0.1-SNAPSHOT.jar

# Execute the application
ENTRYPOINT ["java", "-jar", "configserver-0.0.1-SNAPSHOT.jar"]
