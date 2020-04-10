package com.mycompany.bookapi.service;

import com.mycompany.bookapi.exception.BookNotFoundException;
import com.mycompany.bookapi.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getBooks();

    Book validateAndGetBook(String isbn) throws BookNotFoundException;

    Book saveBook(Book book);

    void deleteBook(Book book);

}
