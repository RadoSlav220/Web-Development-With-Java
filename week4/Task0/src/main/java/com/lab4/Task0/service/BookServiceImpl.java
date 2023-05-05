package com.lab4.Task0.service;

import com.lab4.Task0.model.Book;
import com.lab4.Task0.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookRepository;

    @Override
    public boolean add(Book o) {
        return false;
    }

    @Override
    public void remove(Book o) {

    }

    @Override
    public List<Book> getAllBooksByAuthor(String author) {
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

    @Override
    public void clear() {

    }

    @Override
    public Map<String, List<Book>> getAllBooksGroupByAuthor() {
        return null;
    }

    @Override
    public Map<String, List<Book>> getAllBooksGroupByPublisher() {
        return null;
    }

    @Override
    public List<Book> getAllBooksFilterBy(Predicate<Book> bookPredicate) {
        return null;
    }
}
