package gr.aueb.elearn.Askiseis.ch15.dao;

import gr.aueb.elearn.Askiseis.ch15.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookDAO {
    boolean insert (Book book);
    Optional<Book> update(Book book);
    boolean delete (long id);
    List<Book> getAll ();
    Optional<Book> getOne(long id);
}
