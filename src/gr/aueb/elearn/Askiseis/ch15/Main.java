package gr.aueb.elearn.Askiseis.ch15;


import gr.aueb.elearn.Askiseis.ch15.dao.BookDAOImpl;
import gr.aueb.elearn.Askiseis.ch15.dao.IBookDAO;
import gr.aueb.elearn.Askiseis.ch15.dto.BookDTO;
import gr.aueb.elearn.Askiseis.ch15.model.Book;
import gr.aueb.elearn.Askiseis.ch15.service.BookServiceImpl;
import gr.aueb.elearn.Askiseis.ch15.service.IBookService;
import gr.aueb.elearn.Askiseis.ch15.service.exception.BookAlreadyExistsException;
import gr.aueb.elearn.Askiseis.ch15.service.exception.BookNotExistsException;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    private static final IBookDAO bookDAO = new BookDAOImpl();
    private static final IBookService service = new BookServiceImpl(bookDAO);

    public static void main(String[] args) {

        int choice = 0;
        BookDTO bookDTO;

        do {
            printMenu();
            choice = getChoice();

            switch (choice){
                case 1:
                    try {
                        System.out.println("Εισάγετε τα στοιχεία του βιβλίου: ");
                        bookDTO = new BookDTO(getBookId(),getAuthorId(),getTitle(),getFirstname(),getLastname());
                        service.insertBook(bookDTO);
                        System.out.println("Εισαγωγή Επιτυχής!");
                    } catch (BookAlreadyExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Εισάγετε το ID του βιβλίου προς διαγραφή: ");
                        long id = getBookId();
                        service.deleteBook(id);
                        System.out.println("Διαγραφή Επιτυχής!");
                    } catch (BookNotExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Εισάγετε το ID του βιβλίου που θέλετε να ενημερώσετε και στην συνέχεια τα νέα στοιχεία: ");
                        bookDTO = new BookDTO(getBookId(),getAuthorId(),getTitle(),getFirstname(),getLastname());
                        Optional<Book> optionalBook = service.updateBook(bookDTO);
                        optionalBook.ifPresent(c -> System.out.println("Old book " + c + "was updated!"));
                    } catch (BookNotExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        long id = getBookId();
                        Optional<Book> book = service.getOneBook(id);
                        book.ifPresent(System.out::println);
                    } catch (BookNotExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    List<Book> books = service.getAllBooks();
                    books.forEach(System.out::println);
                    break;
                case 6:
                    System.out.println("Επιλέξατε έξοδο!");
                    break;
                default:
                    System.out.println("Επιλέξτε 1-6");
                    break;
            }

        }while (choice != 6);

    }

    public static void printMenu(){
        System.out.println("Επιλέξτε ένα απο τα παρακάτω");
        System.out.println("1.Εισαγωγή βιβλίου");
        System.out.println("2.Διαγραφή βιβλίου");
        System.out.println("3.Ενημέρωση βιβλίου");
        System.out.println("4.Αναζήτηση βιβλίου");
        System.out.println("5.Εκτύπωση βιβλίων");
        System.out.println("6.Έξοδος");
    }

    public static int getChoice(){
        String s = in.next();
        if (isInt(s)) return Integer.parseInt(s);
        return -1;
    }

    public static String getFirstname(){
        System.out.println("Εισάγετε όνομα Συγγραφέα");
        return in.next();
    }

    public static String getLastname(){
        System.out.println("Εισάγετε επώνυμο Συγγραφέα");
        return in.next();
    }

    public static String getTitle(){
        System.out.println("Εισάγετε τίτλο");
        return in.next();
    }


    private static boolean isInt(String s){
        try {
            Integer.parseInt(s);
            return  true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int getBookId() {
        System.out.println("Εισάγετε το ID του βιβλίου: ");
        String s = in.next();
        if (isInt(s)) {
            return Integer.parseInt(s);
        }
        return -1;
    }

    public static int getAuthorId() {
        System.out.println("Εισάγετε το ID του Συγγραφέα: ");
        String s = in.next();
        if (isInt(s)) {
            return Integer.parseInt(s);
        }
        return -1;
    }
}
