# FROM eclipse-temurin:21-jdk-alpine
# COPY target/ecommerce-backend-0.0.1-SNAPSHOT.jar app.jar
# ENTRYPOINT ["java", "-jar", "/app.jar"]

FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/ecommerce-backend-0.0.1-SNAPSHOT.jar app.jar
COPY Wallet_HQIFCQQY6FMVMZGB /app/Wallet_HQIFCQQY6FMVMZGB
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]