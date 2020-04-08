package edu.uncc.libraryservice.controller;

import edu.uncc.libraryservice.service.BookServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/library/sys")
public class SystemController {

    private final Logger LOG = LoggerFactory.getLogger (getClass ());

    /**
     * The Book service.
     */
    @Autowired
    BookServiceImpl bookService;

    @GetMapping
    public String healthCheck(){
        return bookService.testService();
    }

}
