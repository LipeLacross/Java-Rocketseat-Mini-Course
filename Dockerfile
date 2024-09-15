# Usa uma imagem do Maven com OpenJDK 17
FROM maven:3.8.4-openjdk-17 AS build

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo pom.xml e as dependências
COPY pom.xml ./
RUN mvn dependency:go-offline -B

# Copia o código-fonte do projeto para o container
COPY src ./src

# Compila o projeto e executa os testes
RUN mvn clean install -DskipTests

# Segunda etapa - Usa uma imagem mais enxuta do OpenJDK 17
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho no container
WORKDIR /app

# Copia o artefato gerado na etapa de build
COPY --from=build /app/target/*.jar /app/app.jar

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
