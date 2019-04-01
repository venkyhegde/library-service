package edu.uncc.libraryservice.service;

import edu.uncc.libraryservice.model.Book;

import java.util.List;

/**
 * The interface Book service.
 *
 * @author venky
 */
public interface BookService {
    /**
     * Gets all books.
     *
     * @return the all books
     */
    List<Book> getAllBooks();

    /**
     * Test service string.
     *
     * @return the string
     */
    String testService();
}
