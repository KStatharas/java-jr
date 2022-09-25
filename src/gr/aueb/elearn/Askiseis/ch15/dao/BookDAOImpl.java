package gr.aueb.elearn.Askiseis.ch15.dao;

import gr.aueb.elearn.Askiseis.ch15.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDAOImpl implements IBookDAO {
    private static final List<Book> library = new ArrayList<Book>();


    @Override
    public boolean insert(Book book) {
        if (book == null || library.contains(book)){
            return false;
        }
        library.add(book);
        return true;
    }

    @Override
    public Optional<Book> update(Book book) {
        int posToUpdate = -1;
        if (book == null) return Optional.empty();

        posToUpdate = getPosition(book.getIdBook());
        if(posToUpdate != -1){
            Book bookToReturn = library.get(posToUpdate);
            library.set(posToUpdate,book);
            return  Optional.of(bookToReturn);
        }

        return Optional.empty();
    }

    @Override
    public boolean delete(long id) {
        int posToDelete = getPosition(id);
        if (posToDelete != -1){
            library.remove(posToDelete);
            return true;
        }
        else return false;
    }

    @Override
    public List<Book> getAll() {
        return new ArrayList<Book>(library);
    }

    @Override
    public Optional<Book> getOne(long id) {
        int posToReturn = getPosition(id);
        if (posToReturn != -1){
            return Optional.of(library.get(posToReturn));
        }
        else return Optional.empty();
    }

    private int getPosition(long id){
        int getPos = -1;
        for (int i = 0; i < library.size(); i++) {
            if(library.get(i).getIdBook() == id){
                getPos = i;
                break;
            }
        }
        return getPos;
    }
}
