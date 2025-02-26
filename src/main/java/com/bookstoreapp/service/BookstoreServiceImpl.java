package com.bookstoreapp.service;

import com.bookstoreapp.exception.BookAlreadyExistsException;
import com.bookstoreapp.exception.BookNotFoundException;
import com.bookstoreapp.model.Book;
import com.bookstoreapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class BookstoreServiceImpl implements BookstoreService{


    private BookRepository bookRepository;


    @Override
    public List<Book> getAllBooks() {

    }

    @Override
    public Book getBookById(int id) {
        // check if book exists
        // if book exists return book
        // else throw exception book not found
    }

    @Override
    public Book saveBook(Book book) {

        // check if book exists
        // if book exists throw exception book already exists
        // else save book

    }

    @Override
    public Book updateBook(int id, Book book) {

        // check if book exists
        // if book exists update book
        // else throw exception book not found


    }

    @Override
    public void deleteBook(int id) {

            // check if book exists
            // if book exists delete book
            // else throw exception book not found

    }


}
