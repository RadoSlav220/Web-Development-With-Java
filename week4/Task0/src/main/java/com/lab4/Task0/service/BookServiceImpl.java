package com.lab4.Task0.service;

import com.lab4.Task0.model.Book;
import com.lab4.Task0.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

@Service
public class BookServiceImpl implements BookService{
    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl (BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public boolean add(Book book) {
        if (bookRepository.getByIsbn(book.getIsbn()) != null){
            return false;
        }
        bookRepository.add(book);
        return true;
    }

    @Override
    public void remove(Book book) {
        bookRepository.remove(book);
    }

    @Override
    public List<Book> getAllBooksByAuthor(String author) {
        return bookRepository.getAllBooks().stream()
                                            .filter(book -> book.getAuthor().equals(author))
                                            .toList();
    }

    @Override
    public List<Book> getAllBooksPublishedAfter(LocalDate from) {
        return bookRepository.getAllBooks().stream()
                .filter(book -> book.getPublishedYear().isAfter(from))
                .toList();
    }

    @Override
    public List<Book> getAllBooksBetween(LocalDate from, LocalDate to) {
        return bookRepository.getAllBooks().stream()
                .filter(book -> book.getPublishedYear().isAfter(from) && book.getPublishedYear().isBefore(to))
                .toList();
    }

    @Override
    public void clear() {
        bookRepository.clear();
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
        return bookRepository.getAllBooks()
                            .stream()
                            .filter(bookPredicate)
                            .toList();
    }
}
