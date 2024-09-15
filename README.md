## 🌐 [English Version of README](README_EN.md)

# Java-Rocketseat-Mini-Course
# ToDoList Application

Este projeto é uma aplicação de lista de tarefas (To-Do List) que permite aos usuários criar, editar e listar suas tarefas pessoais.

## 🔨 Funcionalidades do Projeto

- Registro e autenticação de usuários.
- CRUD (Create, Read, Update, Delete) de tarefas.
- Autenticação baseada em token JWT.
- Filtro de autenticação para operações em tarefas.

### Exemplo Visual do Projeto

![Screenshot 2024-09-15 162402](https://github.com/user-attachments/assets/b746bd54-8e20-457d-866e-a198e587a274)
![Screenshot 2024-09-15 163035](https://github.com/user-attachments/assets/7d6f1185-4bff-49ae-9554-f6b89bb58074)
![Screenshot 2024-09-15 163048](https://github.com/user-attachments/assets/914829eb-a4b7-40b9-81a9-8e0ed9c5b99d)

## ✔️ Técnicas e Tecnologias Utilizadas

- **Spring Boot**: Framework para criação de aplicações Java.
- **Spring Data JPA**: Facilita o acesso e manipulação de dados usando Java Persistence API.
- **H2 Database**: Banco de dados em memória para ambiente de desenvolvimento.
- **BCrypt**: Biblioteca para hashing de senhas.
- **JWT (JSON Web Token)**: Para autenticação e autorização.
- **Docker**: Para containerização da aplicação.
- **Maven**: Gerenciador de dependências e build.
- **JUnit**: Framework de testes para Java.

## 📁 Estrutura do Projeto

- **src/main/java/br/com/lipelacross/todolist/**: Contém o código fonte da aplicação.
    - **controller/**: Controladores REST da aplicação.
    - **filter/**: Filtros para autenticação.
    - **models/**: Entidades da aplicação.
    - **repositories/**: Repositórios JPA.
    - **services/**: Camada de serviço da aplicação.
    - **config/**: Configurações de segurança e outras configurações.
        - **WebSecurityConfig.java**: Configuração de segurança para proteger endpoints e gerenciar autenticação.
    - **TodolistApplication.java**: Ponto de entrada da aplicação Spring Boot.
- **src/test/**: Testes unitários da aplicação.
- **resources/**: Arquivos de configuração e propriedades.
- **Dockerfile**: Arquivo para construir a imagem Docker.
- **docker-compose.yml**: Arquivo para orquestração dos contêineres Docker.
- **pom.xml**: Arquivo de configuração do Maven.
- **mvnw, mvnw.cmd**: Wrapper do Maven para execução do projeto em sistemas Unix e Windows.
- **README.md**: Este arquivo de documentação.
- **HELP.md**: Arquivo de ajuda com informações adicionais.

## 🛠️ Abrir e rodar o projeto

Para iniciar o projeto localmente, siga uma das opções abaixo:

### Usando Docker Compose

1. **Certifique-se de ter o Docker e o Docker Compose instalados**:
    - Verifique se o Docker está instalado com:
      ```bash
      docker -v
      ```
    - Instale o Docker Compose se não estiver instalado:
      ```bash
      docker-compose -v
      ```

2. **Clone o Repositório**:
    - Copie a URL do repositório e execute o comando abaixo no terminal:
      ```bash
      git clone <URL_DO_REPOSITORIO>
      cd nomedoprojeto
      ```

3. **Configurar as variáveis de ambiente**:
    - Crie um arquivo `.env` na raiz do projeto e defina as variáveis de ambiente necessárias, como `DATABASE_URL`, `JWT_SECRET`, etc.

4. **Inicie o projeto usando Docker Compose**:
    - Execute o seguinte comando para iniciar os contêineres Docker:
      ```bash
      docker-compose up
      ```

### Usando Maven

1. **Certifique-se de ter o Maven instalado**:
    - Verifique se o Maven está instalado com:
      ```bash
      mvn -v
      ```
    - Se não estiver instalado, baixe e instale a partir do [site oficial do Maven](https://maven.apache.org/download.cgi).

2. **Clone o Repositório**:
    - Copie a URL do repositório e execute o comando abaixo no terminal:
      ```bash
      git clone <URL_DO_REPOSITORIO>
      cd nomedoprojeto
      ```

3. **Executar o projeto com Maven**:
    - Use o seguinte comando Maven para compilar e executar o projeto:
      ```bash
      mvn spring-boot:run
      ```

Escolha uma das opções acima conforme a sua preferência para iniciar o projeto localmente.

## 🔐 Configuração de Segurança

O projeto inclui uma configuração de segurança personalizada para proteger os endpoints e gerenciar a autenticação dos usuários.

### **Configuração de Segurança: `WebSecurityConfig.java`**

- **Localização**: `src/main/java/br/com/lipelacross/todolist/config/WebSecurityConfig.java`
- **Descrição**: Esta classe configura as regras de segurança da aplicação, incluindo a proteção dos endpoints REST e a autenticação baseada em JWT. A configuração define as permissões de acesso, autenticação e possíveis exceções.

## 🌐 Deploy

Para o deploy da aplicação, considere utilizar plataformas de hospedagem de aplicativos como Heroku, AWS, ou Azure, seguindo as melhores práticas de segurança e escalabilidade.

## 📚 Material Complementar

Para mais detalhes sobre Java, consulte o [Curso de Java](https://efficient-sloth-d85.notion.site/Curso-de-Java-2408d11bfc3447e980fe9460b6293976) utilizado como referência para este projeto.
