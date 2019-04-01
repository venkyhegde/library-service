package edu.uncc.libraryservice.controller;

import edu.uncc.libraryservice.model.Book;
import edu.uncc.libraryservice.service.BookServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type Library controller.
 *
 * @author venky
 */
@RestController
@RequestMapping(value = "/library/api")
public class LibraryController {

    private final Logger LOG = LoggerFactory.getLogger (getClass ());

    /**
     * The Book service.
     */
    @Autowired
    BookServiceImpl bookService;

    /**
     * Get all books list.
     *
     * @return the list
     */
    @RequestMapping(value = "/allBooks", method = RequestMethod.GET)
    public List<Book> getAllBooks() {
        LOG.info ("Getting all books");
        return bookService.getAllBooks ();
    }

    /**
     * Heart beat string.
     *
     * @return the string
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String heartBeat() {
        return bookService.testService ();
    }
}
