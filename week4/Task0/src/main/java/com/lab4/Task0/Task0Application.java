package com.lab4.Task0;

import com.lab4.Task0.model.Book;
import com.lab4.Task0.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class Task0Application implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(Task0Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book1 = new Book("Narnia", "John",
								new BigDecimal(12.09), "Pulblisher",
								LocalDate.of(2001, 12, 1), "BG123");
		Book book2 = new Book("Narnia", "Petar",
				new BigDecimal(12.09), "Pulblisher",
				LocalDate.of(2001, 12, 1), "BG124");
		Book book3 = new Book("Book for the jungle", "John",
				new BigDecimal(12.09), "Pulblisher",
				LocalDate.of(2001, 12, 1), "BG125");

		bookService.add(book1);
		bookService.add(book2);
		bookService.add(book3);

		List<Book> list = bookService.getAllBooksByAuthor("John");
		for (Book book : list){
			System.out.println(book.getTitle() + " " + book.getIsbn());
		}
	}
}
