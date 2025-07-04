package com.library.service;

import com.library.repository.BookRepository;
import com.library.repository.LoggerService;

public class BookService {
    private BookRepository bookRepository;
    private LoggerService loggerService;

    // Constructor injection
    public BookService(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        String title = bookRepository.getBookTitle();
        loggerService.log("Displaying book: " + title);
        System.out.println("Book: " + title);
    }
}
