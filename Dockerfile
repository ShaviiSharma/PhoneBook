FROM openjdk
MAINTAINER shavi
WORKDIR /app
COPY target/PhoneBook.jar /app/PhoneBook.jar
ENTRYPOINT ["java","-jar","PhoneBook.jar"]
