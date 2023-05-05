package com.lab4.Task0.repository;

import com.lab4.Task0.model.Book;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookRepositoryImpl implements BookRepository{
    private Map <String, Book> db = new HashMap<>();

    @Override
    public void add(Book book) {
        db.put(book.getIsbn(), book);
    }

    @Override
    public void remove(Book book) {
        db.remove(book.getIsbn());
    }

    @Override
    public void clear() {
        db.clear();
    }

    @Override
    public Book getByIsbn(String isbn) {
        return db.get(isbn);
    }

    @Override
    public List<Book> getAllBooks() {
        return db.values().stream().toList();
    }
}
