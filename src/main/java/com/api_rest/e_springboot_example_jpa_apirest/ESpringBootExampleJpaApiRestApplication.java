package com.api_rest.e_springboot_example_jpa_apirest;

import com.api_rest.e_springboot_example_jpa_apirest.Entities.Book;
import com.api_rest.e_springboot_example_jpa_apirest.Repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ESpringBootExampleJpaApiRestApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(ESpringBootExampleJpaApiRestApplication.class, args);

        BookRepository bookRepository = context.getBean(BookRepository.class);
        /* http://localhost:8080/swagger-ui/ */
        /* Create Book */
        Book book = new Book(
                null,
                "Código limpio Manual de estilo para el desarrollo ágil de software",
                "Robert C. Martin",
                561,
                29.99,
                LocalDate.of(2018, 3, 21),
                true
                );

        Book book2 = new Book(
                null,
                "Arquitectura limpia",
                "Robert C. Martin",
                482,
                29.99,
                LocalDate.of(2018, 3, 21),
                true
        );

        /* Register Book */
        bookRepository.save(book);
        bookRepository.save(book2);
    }
}