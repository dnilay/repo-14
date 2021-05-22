package com.example.demo.service;

import com.example.demo.model.Book;

import java.util.List;

public interface BookService {

    public Book createBook(Book book);
    public Iterable<Book> getAll();
}
