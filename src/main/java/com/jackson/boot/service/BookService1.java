package com.jackson.boot.service;

import com.jackson.boot.entity.Book;
import com.jackson.boot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookService1 {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> findBookList(){
        List<Book> bookList = bookRepository.findAll();
        System.out.println(bookList);

        return bookList;
    }
}
