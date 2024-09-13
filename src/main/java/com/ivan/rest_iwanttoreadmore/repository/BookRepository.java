package com.ivan.rest_iwanttoreadmore.repository;

import com.ivan.rest_iwanttoreadmore.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
}
