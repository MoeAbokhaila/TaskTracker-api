# Task Tracker API

A REST API I built to practice backend development with Spring Boot.  
The goal was to understand how controllers, services, repositories, validation, and database persistence work together in a real-world backend setup.

## Tech Stack
- Java 25
- Spring Boot
- Spring Data JPA
- H2 (in-memory database)
- Spring Validation
- Swagger (OpenAPI)

## How to Run

Run `TaskapiApplication` from IntelliJ.

Once running:

API Base URL:
http://localhost:8080/api/tasks

Swagger UI:
http://localhost:8080/swagger-ui/index.html

H2 Console:
http://localhost:8080/h2-console  
JDBC URL: `jdbc:h2:mem:taskdb`  
Username: `sa`  
Password: (leave blank)

---

## Available Endpoints

- GET `/api/tasks`
- GET `/api/tasks/{id}`
- POST `/api/tasks`
- PUT `/api/tasks/{id}`
- DELETE `/api/tasks/{id}`

---

## Example Request (POST)

```json
{
  "title": "Fix API validation bug",
  "description": "Investigate failing POST request when title is missing",
  "completed": false
}