package com.api_rest.e_springboot_example_jpa_apirest.Repository;

import com.api_rest.e_springboot_example_jpa_apirest.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {}
