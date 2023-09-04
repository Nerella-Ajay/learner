package com.example.apirouting;

import java.util.*;
public interface MyRepository{
    ArrayList<Book> getBook();
    Book getBookByAbout(String about);
}