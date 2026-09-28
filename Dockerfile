FROM eclipse-temurin:21-jre
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]`

