## 🌐 [English Version of README](README_EN.md)

# Java-Rocketseat-Mini-Course
# ToDoList Application

This project is a To-Do List application that allows users to create, edit, and list their personal tasks.

## 🔨 Project Features

- User registration and authentication.
- CRUD (Create, Read, Update, Delete) operations for tasks.
- Token-based JWT authentication.
- Authentication filter for task operations.

### Visual Example of the Project

(Screenshot or visual description of the project, if applicable)

## ✔️ Techniques and Technologies Used

- **Spring Boot**: Framework for building Java applications.
- **Spring Data JPA**: Facilitates data access and manipulation using Java Persistence API.
- **H2 Database**: In-memory database for the development environment.
- **BCrypt**: Library for password hashing.
- **JWT (JSON Web Token)**: For authentication and authorization.
- **Docker**: For containerizing the application.
- **Maven**: Dependency and build management tool.
- **JUnit**: Testing framework for Java.

## 📁 Project Structure

- **src/main/java/br/com/lipelacross/todolist/**: Contains the application's source code.
    - **controller/**: REST controllers of the application.
    - **filter/**: Authentication filters.
    - **models/**: Application entities.
    - **repositories/**: JPA repositories.
    - **services/**: Service layer of the application.
    - **TodolistApplication.java**: Entry point of the Spring Boot application.
- **src/test/**: Unit tests for the application.
- **resources/**: Configuration and properties files.
- **Dockerfile**: File for building the Docker image.
- **docker-compose.yml**: File for orchestrating Docker containers.
- **pom.xml**: Maven configuration file.
- **mvnw, mvnw.cmd**: Maven wrapper for running the project on Unix and Windows systems.
- **README.md**: This documentation file.
- **HELP.md**: Help file with additional information.

## 🛠️ Running the Project

To start the project locally, follow one of the options below:

### Using Docker Compose

1. **Ensure Docker and Docker Compose are installed**:
    - Check if Docker is installed with:
      ```bash
      docker -v
      ```
    - Install Docker Compose if it’s not installed:
      ```bash
      docker-compose -v
      ```

2. **Clone the Repository**:
    - Copy the repository URL and run the following command in your terminal:
      ```bash
      git clone <REPOSITORY_URL>
      cd projectname
      ```

3. **Configure environment variables**:
    - Create a `.env` file at the root of the project and define necessary environment variables, such as `DATABASE_URL`, `JWT_SECRET`, etc.

4. **Start the project using Docker Compose**:
    - Run the following command to start the Docker containers:
      ```bash
      docker-compose up
      ```

### Using Maven

1. **Ensure Maven is installed**:
    - Check if Maven is installed with:
      ```bash
      mvn -v
      ```
    - If not installed, download and install from the [official Maven website](https://maven.apache.org/download.cgi).

2. **Clone the Repository**:
    - Copy the repository URL and run the following command in your terminal:
      ```bash
      git clone <REPOSITORY_URL>
      cd projectname
      ```

3. **Run the project with Maven**:
    - Use the following Maven command to compile and run the project:
      ```bash
      mvn spring-boot:run
      ```

Choose one of the above options based on your preference to start the project locally.

## 🌐 Deployment

For deploying the application, consider using hosting platforms like Heroku, AWS, or Azure, following best practices for security and scalability.

## ℹ️ Java Course Documentation

For more details about Java, refer to the [Java Course](https://efficient-sloth-d85.notion.site/Curso-de-Java-2408d11bfc3447e980fe9460b6293976) used as a reference for this project.
