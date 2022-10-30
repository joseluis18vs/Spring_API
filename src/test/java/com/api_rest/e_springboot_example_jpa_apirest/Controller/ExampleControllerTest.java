//package com.api_rest.e_springboot_example_jpa_apirest.Controller;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.test.web.server.LocalServerPort;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class ExampleControllerTest {
//    @LocalServerPort
//    private int port;
//    private TestRestTemplate testRestTemplate;
//
//    @Autowired
//    private RestTemplateBuilder restTemplateBuilder;
//
//    @BeforeEach
//    void setUp() {
//        restTemplateBuilder = restTemplateBuilder.rootUri("http://localhost:" + port);
//        testRestTemplate = new TestRestTemplate(restTemplateBuilder);
//    }
//
//    @Test
//    void hi() {
//        ResponseEntity<String> responseHttp = testRestTemplate.getForEntity("/saludar", String.class);
//        assertEquals(HttpStatus.OK, responseHttp.getStatusCode());
//        assertEquals("Hello", responseHttp.getBody());
//    }
//}