# Fase de construção
FROM ubuntu:latest as build

# Instalação do OpenJDK 17 e Maven
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk maven

# Define o diretório de trabalho
WORKDIR /app

# Copia todos os arquivos para o contêiner
COPY . .

# Compila o código Java com Maven
RUN mvn clean install

# Fase final (runtime)
FROM openjdk:17-jdk-slim

# Expor a porta 8080
EXPOSE 8080

# Define o diretório de trabalho
WORKDIR /app

# Copia o JAR compilado da fase de construção para a fase final
COPY --from=build /app/target/todolist-1.0.0.jar app.jar

# Comando de inicialização da aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
