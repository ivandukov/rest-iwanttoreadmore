package com.ivan.rest_iwanttoreadmore.controller;

import com.ivan.rest_iwanttoreadmore.dto.BookDTO;
import com.ivan.rest_iwanttoreadmore.model.Book;
import com.ivan.rest_iwanttoreadmore.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(
            BookService bookService
    ) {
        this.bookService = bookService;
    }


    @PostMapping
    public ResponseEntity<?> createBook(
            @Valid @RequestBody BookDTO bookDTO,
            BindingResult result
    ) {

        // If validation errors exist, return a bad request response
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body(result.getFieldErrors());
        }

        Book newBook = bookService.createBook(bookDTO);
        return ResponseEntity.ok(newBook);
    }

}
