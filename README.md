# TaskAPI - API REST de Tareas

Este proyecto es una API RESTful desarrollada con Spring Boot y PostgreSQL para gestionar tareas. Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre las tareas, así como filtrarlas por estado o título.

## Tecnologías Utilizadas

- Java 17  
- Spring Boot  
- Spring Data JPA  
- PostgreSQL  
- Lombok  
- Swagger (OpenAPI) para documentación de la API  

## Instalación

1. Clona el repositorio:

    ```bash
    git clone https://github.com/Diegox1406/taskapi.git
    cd taskapi
    ```

2. Crea la base de datos en PostgreSQL:

    Ejecuta el script SQL:  
    `database/taskapidb_script.sql`

3. Configura la conexión a la base de datos en `src/main/resources/application.properties`:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/taskapidb
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    ```

4. Compila y ejecuta la aplicación:

    ```bash
    ./mvnw spring-boot:run
    ```

## Documentación Swagger

Consulta la documentación de la API en:

[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

## 📌 Endpoints Principales

- `GET /tasks` – Obtener todas las tareas  
- `GET /tasks/{id}` – Obtener tarea por ID  
- `POST /tasks` – Crear nueva tarea  
- `PUT /tasks/{id}` – Actualizar tarea existente  
- `DELETE /tasks/{id}` – Eliminar tarea por ID  
- `GET /tasks/filter` – Filtrar tareas por estado o título  
- `GET /tasks/count` – Obtener conteo de tareas por estado  
