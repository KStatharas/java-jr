package gr.aueb.elearn.Askiseis.ch15.service.exception;

import gr.aueb.elearn.Askiseis.ch15.model.Book;

public class BookNotExistsException extends Exception{

    public BookNotExistsException (Book book){
        super("Book with ID " + book.getIdBook() + " does not exist.");
    }

    public BookNotExistsException (long id){
        super("Book with ID " + id + " does not exist.");
    }
}
