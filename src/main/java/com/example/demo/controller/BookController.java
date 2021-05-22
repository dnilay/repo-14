package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class BookController {
private BookService bookService;

@Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/books")
    public ResponseEntity<Book> createBook(@RequestBody Book book)
    {
        return new ResponseEntity<Book>(bookService.createBook(book),HttpStatus.CREATED);
    }
    @GetMapping("/books")
    public ResponseEntity<Iterable<Book>> getAll()
    {
        return new ResponseEntity<Iterable<Book>>(bookService.getAll(),HttpStatus.OK);
    }
}
