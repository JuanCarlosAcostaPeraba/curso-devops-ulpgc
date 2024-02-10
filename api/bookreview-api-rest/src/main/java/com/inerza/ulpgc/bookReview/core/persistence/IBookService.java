package com.inerza.ulpgc.bookReview.core.persistence;

import com.inerza.ulpgc.bookReview.model.entities.Book;

import java.util.List;

public interface IBookService {

    List<Book> getBookList(int page, int size, String sortDir, String sort);

    void updateBook(Book post);

    Book createBook(Book post);

    Book getBookById(Long id);

    void deleteBookById(Long id);
}
