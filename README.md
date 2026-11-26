# Task Tracker API

A Spring Boot REST API for creating, listing, updating, and deleting tasks, using an in-memory H2 database.

The application and Maven wrapper are in [`taskapi/`](taskapi/). See the [application README](taskapi/README.md) for endpoints, setup, and an example request.

## Run

Requires Java 25. From the repository root:

```sh
cd taskapi
./mvnw spring-boot:run
```

On Windows, use `mvnw.cmd spring-boot:run`. The API is available at `http://localhost:8080/api/tasks`; the in-memory database is reset when the application stops.
