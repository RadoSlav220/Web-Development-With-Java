package com.lab4.Task0.repository;

import com.lab4.Task0.model.Book;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepositoryImpl implements BookRepository{
    private Map <String, Book> db = new HashMap<>();

    @Override
    public boolean add(Book o) {
        return false;
    }

    @Override
    public void remove(Book o) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Book getByIsbn(String isbn) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public List<Book> getAllBooksByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> getAllBooksByPublisher(String author) {
        return null;
    }

    @Override
    public List<Book> getAllBooksPublishedAfter(LocalDate from) {
        return null;
    }

    @Override
    public List<Book> getAllBooksBetween(LocalDate from, LocalDate to) {
        return null;
    }
}
