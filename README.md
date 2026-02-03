# Resource Booking System

Internal web application to manage meeting room and shared equipment reservations (projectors, video kits, etc.).
It prevents booking conflicts, checks availability, and demonstrates a clean Java (Spring Boot) + Angular architecture.

## Features (MVP)

- Authentication (JWT)
- Rooms management (CRUD) — admin only
- Equipment management (CRUD) — admin only
- Bookings (create/list/cancel)
- Business rules:
  - No overlapping bookings for the same room
  - Equipment stock cannot be exceeded for a given time range
- Availability search (rooms + equipment)

## Tech Stack

**Backend**

- Java 17, Spring Boot
- Spring Web, Spring Data JPA, Spring Security
- PostgreSQL (Docker), H2 for local dev
- OpenAPI / Swagger UI

**Frontend**

- Angular + Angular Material
- Reactive Forms, Routing, Guards, Interceptors
