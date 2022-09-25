package gr.aueb.elearn.Askiseis.ch15.dto;

import gr.aueb.elearn.Askiseis.ch15.model.Book;

import java.util.Objects;

public class BookDTO {
    private long idBook;
    private long idAuthor;
    private String title;
    private String fnameAuthor;
    private String lnameAuthor;

    public BookDTO(){}

    public BookDTO(long idBook, long idAuthor, String title, String fnameAuthor, String lnameAuthor) {
        this.idBook = idBook;
        this.idAuthor = idAuthor;
        this.title = title;
        this.fnameAuthor = fnameAuthor;
        this.lnameAuthor = lnameAuthor;
    }

    public long getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public long getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFnameAuthor() {
        return fnameAuthor;
    }

    public void setFnameAuthor(String fnameAuthor) {
        this.fnameAuthor = fnameAuthor;
    }

    public String getLnameAuthor() {
        return lnameAuthor;
    }

    public void setLnameAuthor(String lnameAuthor) {
        this.lnameAuthor = lnameAuthor;
    }


}


