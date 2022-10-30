package com.api_rest.e_springboot_example_jpa_apirest.Controller;

import com.api_rest.e_springboot_example_jpa_apirest.Entities.Book;
import com.api_rest.e_springboot_example_jpa_apirest.Repository.BookRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    /* Atributos */
    private final Logger log = LoggerFactory.getLogger(BookController.class);
    private BookRepository bookRepository;

    /* Constructor */
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /* Books CRUD */
    /* Create Book */
    @PostMapping("/api/books")
    @ApiOperation("Guarda el registro en base de datos.")
    public ResponseEntity<Book> create(@ApiParam("Objeto Libro (Json)") @RequestBody Book book, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        if(book.getId() != null){
            log.warn("trying to create a book with id");
            System.out.println("trying to create a book with id");
            return ResponseEntity.badRequest().build();
        }
        Book result = bookRepository.save(book);
        return ResponseEntity.ok(result);
    }

    /* Read All Books */
    @GetMapping("/api/books_list")
    public List<Book> findAll(@RequestHeader HttpHeaders header){
        System.out.println(header.get("User-Agent"));
        return bookRepository.findAll();
    }

    /* Read Book by ID. */
    @GetMapping("/api/book/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        Optional<Book> bookOpt = bookRepository.findById(id);
        if(bookOpt.isPresent()){
            return ResponseEntity.ok(bookOpt.get());
        }
        return ResponseEntity.notFound().build();
    }

    /* Update Book */
    @PutMapping("/api/books")
    public ResponseEntity update(@RequestBody Book book){
        if(book.getId() != null){
            if(bookRepository.existsById(book.getId())){
                Book result = bookRepository.save(book);
                return ResponseEntity.ok(result);
            }
            log.warn("Try to update non exist book");
            return ResponseEntity.notFound().build();
        }
        log.warn("Try to update non exist book");
        return ResponseEntity.badRequest().build();
    }

    /* Delete Book by ID. */
    @DeleteMapping("/api/book/remove/{id}")
    @ApiIgnore /* Oculta el método en el swagger-ui*/
    public ResponseEntity deleteById(@PathVariable Long id){
        Optional<Book> bookOpt = bookRepository.findById(id);
        if(bookOpt.isPresent()){
            bookRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}