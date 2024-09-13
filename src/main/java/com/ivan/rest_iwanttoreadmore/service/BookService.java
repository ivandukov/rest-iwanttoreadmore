package com.ivan.rest_iwanttoreadmore.service;

import com.ivan.rest_iwanttoreadmore.dto.BookDTO;
import com.ivan.rest_iwanttoreadmore.model.Book;
import com.ivan.rest_iwanttoreadmore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(
            BookRepository bookRepository
    ) {
        this.bookRepository = bookRepository;
    }

    /**
     * Returns all books from the database
     *
     * @return List of all books
     */
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    /**
     * Creates a new book in the database
     *
     * @param book BookDTO object containing the book's title
     * @return The newly created book
     */
    public Book createBook(BookDTO book) {
        Book newBook = new Book(
                book.title,
                null,
                0,
                0,
                null

        );
        return bookRepository.save(newBook);
    }


}
