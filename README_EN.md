## 🌐 [English Version of README](README_EN.md)

# Java-Rocketseat-Mini-Course
# ToDoList Application

This project is a To-Do List application that allows users to create, edit, and list their personal tasks.

## 🔨 Project Features

- User registration and authentication.
- CRUD (Create, Read, Update, Delete) for tasks.
- JWT-based authentication.
- Authentication filter for task operations.

### Visual Example of the Project

![Screenshot 2024-09-15 162402](https://github.com/user-attachments/assets/b746bd54-8e20-457d-866e-a198e587a274)
![Screenshot 2024-09-15 163035](https://github.com/user-attachments/assets/7d6f1185-4bff-49ae-9554-f6b89bb58074)
![Screenshot 2024-09-15 163048](https://github.com/user-attachments/assets/914829eb-a4b7-40b9-81a9-8e0ed9c5b99d)

## ✔️ Techniques and Technologies Used

- **Spring Boot**: Framework for building Java applications.
- **Spring Data JPA**: Simplifies data access and manipulation using Java Persistence API.
- **H2 Database**: In-memory database for development environment.
- **BCrypt**: Library for hashing passwords.
- **JWT (JSON Web Token)**: For authentication and authorization.
- **Docker**: For containerizing the application.
- **Maven**: Dependency management and build tool.
- **JUnit**: Testing framework for Java.

## 📁 Project Structure

- **src/main/java/br/com/lipelacross/todolist/**: Contains the application's source code.
    - **controller/**: REST controllers of the application.
    - **filter/**: Filters for authentication.
    - **models/**: Application entities.
    - **repositories/**: JPA repositories.
    - **services/**: Service layer of the application.
    - **config/**: Security and other configurations.
        - **WebSecurityConfig.java**: Security configuration for protecting endpoints and managing authentication.
    - **TodolistApplication.java**: Entry point of the Spring Boot application.
- **src/test/**: Unit tests of the application.
- **resources/**: Configuration and properties files.
- **Dockerfile**: File for building the Docker image.
- **docker-compose.yml**: File for orchestrating Docker containers.
- **pom.xml**: Maven configuration file.
- **mvnw, mvnw.cmd**: Maven wrapper for running the project on Unix and Windows systems.
- **README.md**: This documentation file.
- **HELP.md**: Help file with additional information.

## 🛠️ Running the Project

To run the project locally, follow one of the options below:

### Using Docker Compose

1. **Ensure Docker and Docker Compose are installed**:
    - Check if Docker is installed with:
      ```bash
      docker -v
      ```
    - Install Docker Compose if not already installed:
      ```bash
      docker-compose -v
      ```

2. **Clone the Repository**:
    - Copy the repository URL and run the following command in your terminal:
      ```bash
      git clone <REPOSITORY_URL>
      cd projectname
      ```

3. **Configure Environment Variables**:
    - Create a `.env` file at the root of the project and set the necessary environment variables, such as `DATABASE_URL`, `JWT_SECRET`, etc.

4. **Start the Project Using Docker Compose**:
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
    - If not installed, download and install it from the [official Maven site](https://maven.apache.org/download.cgi).

2. **Clone the Repository**:
    - Copy the repository URL and run the following command in your terminal:
      ```bash
      git clone <REPOSITORY_URL>
      cd projectname
      ```

3. **Run the Project with Maven**:
    - Use the following Maven command to build and run the project:
      ```bash
      mvn spring-boot:run
      ```

Choose one of the options above based on your preference to start the project locally.

## 🔐 Security Configuration

The project includes a custom security configuration to protect endpoints and manage user authentication.

### **Security Configuration: `WebSecurityConfig.java`**

- **Location**: `src/main/java/br/com/lipelacross/todolist/config/WebSecurityConfig.java`
- **Description**: This class configures the security rules for the application, including protecting REST endpoints and managing JWT-based authentication. The configuration defines access permissions, authentication, and possible exceptions.

## 🌐 Deployment

For deploying the application, consider using hosting platforms such as Heroku, AWS, or Azure, following best practices for security and scalability.

## 📚 Additional Material

For more details on Java, refer to the [Java Course](https://efficient-sloth-d85.notion.site/Curso-de-Java-2408d11bfc3447e980fe9460b6293976) used as a reference for this project.
