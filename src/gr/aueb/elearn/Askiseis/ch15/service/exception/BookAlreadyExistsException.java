package gr.aueb.elearn.Askiseis.ch15.service.exception;

import gr.aueb.elearn.Askiseis.ch15.model.Book;

public class BookAlreadyExistsException extends Exception{

    public BookAlreadyExistsException(Book book){
        super("The book with ID " + book.getIdBook() + " already exists.");
    }
}
