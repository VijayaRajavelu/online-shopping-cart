Project Overview
The Shopping Cart Application is a full-stack web application built using Spring Boot, Thymeleaf, and MySQL.  
It allows users to browse products, add them to a cart, complete checkout, and receive an email notification after successful payment.
The application is deployed on AWS using RDS for database management and S3 for media storage.

Features
- User authentication and authorization
- Product listing and shopping cart management
- Secure checkout and order placement
- Email notification sent to user after successful payment
- Server-side rendering using Thymeleaf
- Persistent data storage with MySQL

Technologies Used
- Backend: Spring Boot
- Frontend: Thymeleaf, HTML, CSS
- Database: MySQL (AWS RDS)
- ORM: Spring Data JPA / Hibernate
- Email Service: Spring Boot Mail (SMTP)
- Cloud Services: AWS RDS, AWS S3
- Build Tool: Maven
- Java Version: Java 17

Project Modules
- User Module – User registration and login
- Product Module – Product management
- Cart Module – Add, update, and remove items from cart
- Order and Payment Module – Checkout and order processing
- Notification Module – Sends email after payment success
