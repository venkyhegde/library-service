package edu.uncc.libraryservice.repository;

import edu.uncc.libraryservice.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Book repository.
 *
 * @author venky
 */
@Repository
public interface BookRepository extends MongoRepository<Book, String> {
}
