package com.api_rest.e_springboot_example_jpa_apirest.Entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Books")
@ApiModel("Libros - Modelo")
public class Book {
    /*Atributos*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private Integer pages;
    @ApiModelProperty("Precio en Dólares.")
    private Double price;
    private LocalDate releaseDate;
    private Boolean digitalVersion;

    /*Constructor*/
    public Book() {}

    public Book(Long id, String title, String author, Integer pages, Double price, LocalDate releaseDate, Boolean digitalVersion) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.releaseDate = releaseDate;
        this.digitalVersion = digitalVersion;
    }

    /*Getter-Setter*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Boolean getDigitalVersion() {
        return digitalVersion;
    }

    public void setDigitalVersion(Boolean digitalVersion) {
        this.digitalVersion = digitalVersion;
    }

    /*To String*/

}
