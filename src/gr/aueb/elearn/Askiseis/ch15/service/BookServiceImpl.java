package gr.aueb.elearn.Askiseis.ch15.service;

import gr.aueb.elearn.Askiseis.ch15.dao.IBookDAO;
import gr.aueb.elearn.Askiseis.ch15.dto.BookDTO;
import gr.aueb.elearn.Askiseis.ch15.model.Book;
import gr.aueb.elearn.Askiseis.ch15.service.exception.BookAlreadyExistsException;
import gr.aueb.elearn.Askiseis.ch15.service.exception.BookNotExistsException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements IBookService {

    private final IBookDAO dao;


    //Dependency Injection
    public BookServiceImpl(IBookDAO bookDAO) {
        this.dao = bookDAO;
    }

        @Override
    public boolean insertBook(BookDTO bookDTO) throws BookAlreadyExistsException {
        try{
            Book book = convertDTO(bookDTO);
            if (dao.insert(book)) return true;
            else throw new BookAlreadyExistsException(book);
        }
        catch (BookAlreadyExistsException e){
            System.err.println("Book Already Exists error " + LocalDateTime.now());
            throw e;
        }
    }

    @Override
    public void deleteBook(long id) throws BookNotExistsException {
        try {
            if (!dao.delete(id)) throw new BookNotExistsException(id);
        } catch (BookNotExistsException e) {
            System.err.println("Book Not Exists Exception");
            throw e;
        }
    }

    @Override
    public Optional<Book> updateBook(BookDTO bookDTO) throws BookNotExistsException {
        try {
            Book book = convertDTO(bookDTO);
            Optional<Book> bookUpdate = dao.update((book));
            if(!bookUpdate.isPresent()) throw new BookNotExistsException(book);
            else return bookUpdate;
        } catch (BookNotExistsException e) {
            System.err.println("Book Not Exists Exception");
            throw e;
        }
    }

    @Override
    public List<Book> getAllBooks() {
        return dao.getAll();
    }

    @Override
    public Optional<Book> getOneBook(long id) throws BookNotExistsException {
        try {
            Optional<Book> bookFetch = dao.getOne(id);
            if(!bookFetch.isPresent()) throw new BookNotExistsException(id);
            else return bookFetch;

        } catch (BookNotExistsException e) {
            System.err.println("Book Not Exists Exception");
            throw e;

        }
    }



    private Book convertDTO(BookDTO bookDTO){
        return new Book(bookDTO.getIdBook(),bookDTO.getIdAuthor(),bookDTO.getTitle(),bookDTO.getFnameAuthor(), bookDTO.getLnameAuthor());
    }
}
