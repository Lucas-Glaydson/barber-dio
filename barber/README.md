# 💈 Barber DIO

**Barber DIO** is an API developed as part of a practical activity at [Digital Innovation One (DIO)](https://www.dio.me/).  
The goal of this project is to provide a simple and efficient solution for managing appointments in a barber shop — including scheduling, listing, and organizing service times.

---

## 🚀 Technologies Used

- **Spring Boot** – Java framework for building REST APIs
- **Docker** – Containerization platform for environment isolation
- **PostgresSQL** – Relational database for persisting appointment data
- **Swagger / OpenAPI** – API documentation and testing interface
- **Maven** – Dependency management and project build tool

---
## 📁 Project Structure

```
app
├── controller
│   └── SchedulingController.java
│
├── dto
│   └── CreateSchedulingDto.java 
│
├── entity
│   └── Scheduling.java
│
├── factory
│   └── SchedulingFactory.java
│
├── repository
│   └── SchedulingRepository.java
│
├── services
│   ├── ISchedulingService.java
│   └── SchedulingService.java
│
├── middleware
│   ├── exceptions
│   │   ├── CreateSchedulingException.java
│   │   └── FindSchedulingException.java
│   │
│   └── exceptionsHandler
│       └── ScheduleExceptionHandler.java
│
└── BarberApplication.java    
```

### 📦 Folder Explanation
- **controller**: Contains the REST endpoints responsible for receiving HTTP requests and delegating the processing to the service layer.

- **dto**: Stores Data Transfer Objects used to encapsulate input and output data of the API.

- **entity**: Defines entity classes that map to database tables.

- **factory**: Responsible for converting between DTOs and entities, centralizing transformation logic.

- **repository**: Contains interfaces that handle database operations using Spring Data JPA.

- **services**: Implements business logic. Interfaces define contracts, and classes provide the implementations.

- **middleware/exceptions**: Defines custom exceptions to handle specific application errors.

- **middleware/exceptionsHandler**: Captures and handles exceptions thrown by the application, returning appropriate HTTP responses.

---
## 🛠️ How to Run the Project

### 🪶 Load maven:
- Make sure all application dependencies are properly loaded and installed using Maven.
```bash
./mvnw clean install
```

### 🐋 Run docker compose:
- With Docker and Docker Compose installed, run the following command to start the required containers:
```bash
docker compose up -d
```
---
### 🚀 Run the project
- Now, you can use your favorite IDE to start the application (e.g., by running the BarberApplication class).

---
## 📐 Design Patterns Applied
- **Factory Pattern**: Centralizes object creation logic to promote code reuse and separation of concerns.
- **Dependency Inversion Principle (DIP)**: Encourages the use of interfaces to decouple high-level modules from low-level implementations.

---
## 🔧 Future improvements
- **Caching**: Implement caching mechanisms to optimize performance and reduce database load.
- **Database Migrations**: Add a tool like Flyway or Liquibase to manage and version database schema changes.
- **Environment Variables**: Externalize configuration using environment variables to improve security and support multiple environments.

---
## 📎License
This project is for educational purposes only and has no associated license.
