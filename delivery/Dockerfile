FROM openjdk:17-oracle

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw ./
COPY target/delivery-0.0.1-SNAPSHOT.jar ./

CMD ["java", "-jar", "delivery-0.0.1-SNAPSHOT.jar"]