//package com.api_rest.e_springboot_example_jpa_apirest.Services;
//
//import com.api_rest.e_springboot_example_jpa_apirest.Entities.Book;
//import org.junit.jupiter.api.Test;
//
//import java.time.LocalDate;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class BookPriceCalculatorTest {
//
//    @Test
//    void calculatePriceTest() {
//        /* Test config */
//        Book book = new Book(
//                1L,
//                "La Iliada",
//                "Homero",
//                700,
//                15.99,
//                LocalDate.of(2010, 3, 21),
//                false
//        );
//        BookPriceCalculator calculatorPrice = new BookPriceCalculator();
//
//        /* Run Test */
//        double price = calculatorPrice.calculatePrice(book);
//
//        /* Test validations */
//        assertTrue(price > 0);
//
//    }
//}