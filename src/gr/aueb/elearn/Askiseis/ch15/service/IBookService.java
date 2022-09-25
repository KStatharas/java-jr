package gr.aueb.elearn.Askiseis.ch15.service;

import gr.aueb.elearn.Askiseis.ch15.dto.BookDTO;
import gr.aueb.elearn.Askiseis.ch15.model.Book;
import gr.aueb.elearn.Askiseis.ch15.service.exception.BookAlreadyExistsException;
import gr.aueb.elearn.Askiseis.ch15.service.exception.BookNotExistsException;

import java.util.List;
import java.util.Optional;

public interface IBookService {

    boolean insertBook (BookDTO bookDTO) throws BookAlreadyExistsException;
    void deleteBook(long id) throws BookNotExistsException;
    Optional<Book> updateBook(BookDTO bookDTO) throws BookNotExistsException;
    List<Book> getAllBooks();
    Optional<Book> getOneBook(long id) throws BookNotExistsException;
}
