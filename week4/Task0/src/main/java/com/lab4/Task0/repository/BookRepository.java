package com.lab4.Task0.repository;

import com.lab4.Task0.model.Book;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

@Repository
public interface BookRepository {

    boolean add(Book o);

    void remove(Book o);

    void clear();

    Book getByIsbn(String isbn);

    List<Book> getAllBooks();

    List<Book> getAllBooksByAuthor(String author);

    List<Book> getAllBooksByPublisher(String author);

    List<Book> getAllBooksPublishedAfter(LocalDate from);

    List<Book> getAllBooksBetween(LocalDate from, LocalDate to);
}
