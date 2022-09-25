package gr.aueb.elearn.Askiseis.ch15.model;

import java.util.Objects;

public class Book {
    private long idBook;
    private long idAuthor;
    private String title;
    private String fnameAuthor;
    private String lnameAuthor;

    public Book(){}

    public Book(long idBook, long idAuthor, String title, String fnameAuthor, String lnameAuthor) {
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

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", idAuthor=" + idAuthor +
                ", title='" + title + '\'' +
                ", fnameAuthor='" + fnameAuthor + '\'' +
                ", lnameAuthor='" + lnameAuthor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getIdBook() == book.getIdBook() && getIdAuthor() == book.getIdAuthor() && getTitle().equals(book.getTitle()) && getFnameAuthor().equals(book.getFnameAuthor()) && getLnameAuthor().equals(book.getLnameAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdBook(), getIdAuthor(), getTitle(), getFnameAuthor(), getLnameAuthor());
    }
}
