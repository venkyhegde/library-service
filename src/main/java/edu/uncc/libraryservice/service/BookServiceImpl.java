package edu.uncc.libraryservice.service;

import edu.uncc.libraryservice.model.Book;
import edu.uncc.libraryservice.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Book service.
 *
 * @author venky
 */
@Service
public class BookServiceImpl implements BookService {

    private final Logger LOG = LoggerFactory.getLogger (getClass ());

    /**
     * The Book repository.
     */
    @Autowired
    BookRepository bookRepository;

    @Override public List<Book> getAllBooks() {
        LOG.info ("book service - getting all books");
        return bookRepository.findAll ();
    }

    @Override public String testService() {
        return "Success!";
    }

    @Override public Book addNewBook(Book book) {
        LOG.info ("book service - adding new book");
        return bookRepository.save (book);
    }

}
