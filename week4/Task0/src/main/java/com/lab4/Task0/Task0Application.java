package com.lab4.Task0;

import com.lab4.Task0.model.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class Task0Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Task0Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book = new Book("Narnia", "John",
								new BigDecimal(12.09), "Pulblisher",
								LocalDate.of(2001, 12, 1), "BG123");
		System.out.println(book.getIsbn());
	}
}
