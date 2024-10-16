package com.bookstoreapp.controller;

import com.bookstoreapp.model.Book;
import com.bookstoreapp.service.BookstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class BookstoreController {


    private BookstoreService bookstoreService;

    // GET : /books
    // Return Response code of 200
    public List<Book> getAllBooks() {

    }



    // POST : /books
    public Book saveBook(Book book) {

    }

    // create a PUT request to update a book
    // Return Response code of 202

   // PUT: /books/{id}
    public Book updateBook(int id, Book book) {

    }

    // create a DELETE request to delete a book
    // Return Response code of 204

    // DELETE : /books/{id}
    public void deleteBook(@PathVariable int id) {

    }


    // create a GET request to get a book by id
    // Return Response code of 200

    // GET: /books/{id}
    public Book getBookById(@PathVariable int id) {

    }




}
