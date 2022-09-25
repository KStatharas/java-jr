package gr.aueb.elearn.chapter14.soacontract;

import gr.aueb.elearn.chapter14.soacontract.dao.ContractDAOimpl;
import gr.aueb.elearn.chapter14.soacontract.dao.IContactDAO;
import gr.aueb.elearn.chapter14.soacontract.dto.ContactDTO;
import gr.aueb.elearn.chapter14.soacontract.model.Contact;
import gr.aueb.elearn.chapter14.soacontract.service.ContactAlreadyExistsException;
import gr.aueb.elearn.chapter14.soacontract.service.ContactNotExistsException;
import gr.aueb.elearn.chapter14.soacontract.service.ContactServicempl;
import gr.aueb.elearn.chapter14.soacontract.service.IContactService;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    private static final IContactDAO contactDAO = new ContractDAOimpl();
    private static final IContactService service = new ContactServicempl(contactDAO);

    public static void main(String[] args) {

        int choice = 0;
        ContactDTO contactDTO;

        do {
            printMenu();
            choice = getChoice();

            switch (choice){
                case 1:
                    try {
                        contactDTO = new ContactDTO(getId(),getFirstname(),getLastname());
                        service.insertContact(contactDTO);
                    } catch (ContactAlreadyExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        long id = getId();
                        service.deleteContact(id);
                    } catch (ContactNotExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        contactDTO = new ContactDTO(getId(),getFirstname(),getFirstname());
                        Optional<Contact> optionalContact = service.updateContact(contactDTO);
                        optionalContact.ifPresent(c -> System.out.println("Old contact " + c + " was updated"));
                    } catch (ContactNotExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        long id = getId();
                        Optional<Contact> contact = service.getOneContact(id);
                        contact.ifPresent(System.out::println);
                    } catch (ContactNotExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    List<Contact> contacts = service.getAllContacts();
                    contacts.forEach(System.out::println);
                    break;
                case 6:
                    System.out.println("You have selected exit!");
                    break;
                default:
                    System.out.println("Επιλέξτε 1-6");
                    break;
            }

        }while (choice != 6);

    }

    public static void printMenu(){
        System.out.println("Επιλέξτε ένα απο τα παρακάτω");
        System.out.println("1.Εισαγωγή Επαφής");
        System.out.println("2.Διαγραφή Επαφής");
        System.out.println("3.Ενημέρωση Επαφής");
        System.out.println("4.Αναζήτηση Επαφής");
        System.out.println("5.Εκτύπωση Επαφών");
        System.out.println("6.Έξοδος");
    }

    public static int getChoice(){
        String s = in.next();
        if (isInt(s)) return Integer.parseInt(s);
        return -1;
    }

    public static String getFirstname(){
        System.out.println("Εισάγετε όνομα");
        return in.next();
    }

    public static String getLastname(){
        System.out.println("Εισάγετε επώνυμο");
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

    public static int getId() {
        System.out.println("Insert id");
        String s = in.next();
        if (isInt(s)) {
            return Integer.parseInt(s);
        }
        return -1;
    }
}
