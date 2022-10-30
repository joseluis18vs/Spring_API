//package com.api_rest.e_springboot_example_jpa_apirest.Controller;
//
//import com.api_rest.e_springboot_example_jpa_apirest.Entities.Book;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.test.web.server.LocalServerPort;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.http.*;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class BookControllerTest {
//    @LocalServerPort
//    private int port;
//
//    private TestRestTemplate testRestTemplate;
//
//    @Autowired
//    private RestTemplateBuilder restTemplateBuilder;
//
//    @BeforeEach
//    void setUp() {
//        restTemplateBuilder = restTemplateBuilder.rootUri("http://app-c93ccd33-57fb-422a-befa-45252fbede5f.cleverapps.io");
//        testRestTemplate = new TestRestTemplate(restTemplateBuilder);
//    }
//
//    @Test
//    void findAll() {
//        ResponseEntity<Book[]> responseHttp =
//                testRestTemplate.getForEntity("/api/books_list", Book[].class);
//        assertEquals(HttpStatus.OK, responseHttp.getStatusCode());
//        List<Book> books = Arrays.asList(responseHttp.getBody());
//        System.out.println(books.size());
//    }
//
//    @Test
//    void findById() {
//        ResponseEntity<Book> responseHttp =
//                testRestTemplate.getForEntity("/api/book/1", Book.class);
//        assertEquals(HttpStatus.OK, responseHttp.getStatusCode());
//        assertEquals(HttpStatus.NOT_FOUND, responseHttp.getStatusCode());
//    }
//
//    @Test
//    void create() {
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//
//        String json = """
//                {
//                    "title": "Title Example",
//                    "author": "Robert C. Martin",
//                    "pages": 482,
//                    "price": 29.99,
//                    "releaseDate": "2018-03-21",
//                    "digitalVersion": true
//                }
//                """;
//
//        HttpEntity<String> requestHttp = new HttpEntity<>(json, headers);
//
//        ResponseEntity<Book> response =
//                testRestTemplate.exchange("/api/books", HttpMethod.POST, requestHttp, Book.class);
//
//        Book requestResult = response.getBody();
//        assertEquals(1L, requestResult.getId());
//        assertEquals(29.99, requestResult.getPrice());
//    }
//}