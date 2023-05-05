package com.lab4.Task0.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Book {
    private String title;
    private String author;
    private BigDecimal price;
    private String publisher;
    private LocalDate publishedYear;
    private String isbn;
}
