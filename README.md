# Edustage_Spring
# Spring Boot Backend for Educational Web Application

This is the backend component of the Educational Web Application, built using **Spring Boot**. It provides RESTful APIs to manage users, roles, courses, and reservations, ensuring a secure and efficient interaction between the frontend and the database.

## Features

- **Role-based Authentication**:
  - JSON Web Tokens (JWT) for secure access.
  - Role management for `Student`, `Teacher`, and `Admin`.

- **User Management**:
  - CRUD operations for users.
  - Password encryption using `Spring Security`.

- **Course Management**:
  - Create, update, and delete courses.
  - Reservation system for students to book courses.

- **Security**:
  - Role-based access control (RBAC).
  - Secure endpoints with JWT validation.

- **Database**:
  - MySQL database integration for persistent storage.

## Technologies Used

- **Spring Boot**: For building the backend application.
- **Spring Security**: For authentication and authorization.
- **JWT**: For secure token-based authentication.
- **MySQL**: Database for data persistence.
- **Hibernate**: ORM for database interactions.
- **Postman**: For testing and validating RESTful APIs.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/<your-repo-name>.git
