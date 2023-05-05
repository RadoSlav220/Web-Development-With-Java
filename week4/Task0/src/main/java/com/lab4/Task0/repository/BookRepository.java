package com.lab4.Task0.repository;

import com.lab4.Task0.model.Book;
import java.util.List;

public interface BookRepository {

    void add(Book o);

    void remove(Book o);

    void clear();

    Book getByIsbn(String isbn);

    List<Book> getAllBooks();
}
