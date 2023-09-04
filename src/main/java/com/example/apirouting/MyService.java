// Write your code here. 
package com.example.apirouting;
import java.awt.print.Book;
import java.util.*;
import com.example.apirouting.BookRepository;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class MyService implements MyRepository{
    private HashMap<Integer, Book> hmap = new HashMap<>();
    public MyService(){
        Book b1 = new Book(1, "Harry Potter", "Harry Potter is a series of adventure and suspence thrilling drama.");
        Book b2 = new Book(2, "Rise", "Rise is a story of a person who is become a an inspiration to the people in all the senses");
        hmap.put(b1.getId(), b1);
        hmap.put(b2.getId(), b2);
    }

    @Override
    public ArrayList<Book> getBook(){
        Collection<Book> bookCollection = hmap.values();
        ArrayList<Book> books = new ArrayList<>(bookCollection);
        return books;
    }

    @Override
    public Book getBookByAbout(String about){
        Book book = hmap.get(about);
        if(book == null)throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return book;
    }
}     