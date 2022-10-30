package com.api_rest.e_springboot_example_jpa_apirest.Services;

import com.api_rest.e_springboot_example_jpa_apirest.Entities.Book;

public class BookPriceCalculator {
    public double calculatePrice(Book book){
        double price = book.getPrice();
        if (book.getId() > 500){
            return price + 5;
        }
        return price;
    }
}
