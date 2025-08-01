package com.taskApi.taskapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI getOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Gestión de Tareas")
                        .version("1.0.0")
                        .description("Esta API permite gestionar tareas con operaciones CRUD. " +
                                "Incluye funcionalidades para listar, crear, actualizar y eliminar tareas, " +
                                "así como filtrar por título, prioridad y estado. ")
                        .contact(new Contact()
                                .name("Diego Paz Soldan")
                                .url("https://www.linkedin.com/in/diego-paz-soldan-020200261")
                                .email("pazsoldan1320@gmail.com")));

    }
}
