/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.GetMapping;
 * import org.springframework.web.bind.annotation.RestController;
 * 
 */

// Write your code here.
package com.example.apirouting;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;
import com.example.apirouting.MyService;

@RestController
public class MyController{
    MyService myService = new MyService();
    @GetMapping("/")
    public ArrayList<Book> getBook(){
        return myService.getBook();
    }
    @GetMapping("/{about}")
    public Book getBookByAbout(@PathVariable("about") String about){
        return myService.getBookByAbout(about);
    }

}