package com.api_rest.e_springboot_example_jpa_apirest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

/**
 * Configuración Swagger para la generación de documentación de la API REST.
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetails())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiDetails(){
        return new ApiInfo(
                "Spring Boot Bos API REST",
                "Library API REST 2",
                "1.0",
                "https://www.google.com",
                new Contact("Osui", "http://app-c93ccd33-57fb-422a-befa-45252fbede5f.cleverapps.io/", "osui@gmail.com"),
                "mit",
                "https://opensource.org/licenses/MIT",
                Collections.emptyList());
    }
}
