# TaskAPI - API REST de Tareas

Este proyecto es una API RESTful desarrollada con Spring Boot y PostgesSQL para gestionar tareas. Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre las tareas, así como filtrarlas por estado o título.

## Tecnologías Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Lombok
- Swagger para documentación de la API

## Instalación

1. Clona el repositorio:

    ```bash
git clone https://github.com/Diegox1406/taskapi.git
cd taskapi

2. Crea la base datos PostgreSQL:

Ejecuta este archivo: database/taskapidb_script.sql

3. Configura la conexión a la base de datos en `src/main/resources/application.properties`:

spring.datasource.url=jdbc:postgresql://localhost:5432/taskapidb
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña

4. Compila y ejecuta la aplicación:

    ```bash
./mvnw spring-boot:run

## Consulta la documentación de la API en:
http://localhost:8080/swagger-ui/index.html

## Endpoints 
- `GET /tasks`: Obtiene todas las tareas.
- `GET /tasks/{id}`: Obtiene una tarea por su ID.
- `POST /tasks`: Crea una nueva tarea.
- `PUT /tasks/{id}`: Actualiza una tarea existente.
- `DELETE /tasks/{id}`: Elimina una tarea por su ID.
- `GET /tasks/filter`: Filtra tareas por estado o título.
- `GET /tasks/count`: Obtiene el conteo de tareas por estado.

