package com.ivan.rest_iwanttoreadmore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "books")
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private int totalPages;
    private int pagesRead;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Book(
            String title,
            String author,
            int totalPages,
            int pagesRead,
            LocalDateTime startDate
    ) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.pagesRead = pagesRead;
        this.startDate = startDate;
    }

    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", totalPages=" + totalPages +
                ", pagesRead=" + pagesRead +
                ", startDate=" + startDate +
                '}';
    }
}
