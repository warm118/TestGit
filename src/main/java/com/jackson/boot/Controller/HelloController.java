package com.jackson.boot.Controller;

import com.jackson.boot.entity.Book;
import com.jackson.boot.service.BookService1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {


    private BookService1 bookService1;



    @RequestMapping("/world")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/findBookList")
    public List<Book> bookList() {
        List bookArrayList = new ArrayList<Book>();
        List<Book> bookList = bookService1.findBookList();
        System.out.println(bookList);
        bookArrayList.addAll(bookList);
//        Book book1 = new Book();
//        Book book2 = new Book();
//        book1.setId(1);
//        book1.setName("坏蛋是怎样炼成的");
//        book1.setAuthor("六道");
//        book2.setId(2);
//        book2.setName("恶意");
//        book2.setAuthor("东野圭吾");
//        bookArrayList.add(0,book1);
//        bookArrayList.add(1,book2);

        return bookArrayList;
    }
}

