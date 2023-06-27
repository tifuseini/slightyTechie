# slightyTechie


## How to run the project

### Dependencies
- H2 - In-memory database for development
- Spring Web - Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
- Lombok - Java annotation library which helps to reduce boilerplate code.
- Spring Boot DevTools - Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
- Spring Data JPA - Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
- Swagger UI - Swagger UI is a collection of HTML, Javascript and CSS assets that dynamically generates beautiful documentation from a Swagger-compliant API.

### Prerequisites
- Java 17 
- Maven
- IntelliJ IDEA 2021.2.3 (Community Edition)

### Steps
1. Clone the project
2. Open the project in IntelliJ IDEA
3. Run the project
4. Using Postman, 
5. send a POST request to http://localhost:9090/api/v1/blog/post with the following JSON body:
```json
{
    "title" : "My first blog post",
    "body": "This is my first blog post. I hope you like it.",
    "author" : "slightlyTechie"
}
```
6. send a GET request to http://localhost:9090/api/v1/blog/post/all
7. send a GET request to http://localhost:9090/api/v1/blog/post/{id}
8. send a PUT request to http://localhost:9090/api/v1/blog/post/{id} with the following JSON body:
```json
{
    "title" : "My first blog post",
    "body " : "This is my my update.",
    "author" : "slightlyTechie",
    "updatedBy": "slightlyTechie"
}
```
10. send a GET request to http://localhost:9090/api/v1/blog/post/all
11. send a GET request to http://localhost:9090/api/v1/blog/post/{id}
12. send a DELETE request to http://localhost:9090/api/v1/blog/post/{id}


