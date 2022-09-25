package gr.aueb.elearn.Askiseis.ch16;

import gr.aueb.elearn.Askiseis.ch15.service.exception.BookAlreadyExistsException;
import gr.aueb.elearn.Askiseis.ch15.service.exception.BookNotExistsException;
import gr.aueb.elearn.Askiseis.ch16.dao.AccountDAOImpl;
import gr.aueb.elearn.Askiseis.ch16.dao.IAccountDAO;
import gr.aueb.elearn.Askiseis.ch16.dto.AccountDTO;
import gr.aueb.elearn.Askiseis.ch16.dto.JointDTO;
import gr.aueb.elearn.Askiseis.ch16.dto.JointOverdraftDTO;
import gr.aueb.elearn.Askiseis.ch16.dto.OverdraftDTO;
import gr.aueb.elearn.Askiseis.ch16.model.Account;
import gr.aueb.elearn.Askiseis.ch16.service.AccountServiceImpl;
import gr.aueb.elearn.Askiseis.ch16.service.IAccountService;
import gr.aueb.elearn.Askiseis.ch16.service.exception.AccountAlreadyExistsException;
import gr.aueb.elearn.Askiseis.ch16.service.exception.AccountNotExistsException;
import gr.aueb.elearn.Askiseis.ch16.service.exception.ForbiddenTransactionException;
import gr.aueb.elearn.Askiseis.ch16.service.exception.InvalidSSNException;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    private static final IAccountDAO accountDAO = new AccountDAOImpl();
    private static final IAccountService service = new AccountServiceImpl(accountDAO);

    public static void main(String[] args) {

        int choice = 0;
        AccountDTO accountDTO = null;
        JointDTO jointDTO = null;
        OverdraftDTO overdraftDTO = null;
        JointOverdraftDTO  jointOverdraftDTO = null;


        do {
            printMenu();
            choice = getChoice();

            switch (choice){
                case 1:
                    try {
                        System.out.println("Εισάγετε τα στοιχεία του Λογαριασμού: ");
                        int type = TypeSelect(in);
                        switch (type){
                            case 1 :
                                accountDTO = new AccountDTO(getId(),getIBAN(),getLastname(),getFirstname(),getSSN(),getBalance());
                                service.insertAccount(accountDTO);
                                break;
                            case 2:
                                jointDTO = new JointDTO(getId(),getIBAN(),getLastname(),getFirstname(),getSSN(),getBalance(),getLastname2(), getFirstname2());
                                service.insertAccount(jointDTO);
                                break;
                            case 3:
                                overdraftDTO = new OverdraftDTO(getId(),getIBAN(),getLastname(),getFirstname(),getSSN(),getBalance());
                                service.insertAccount(overdraftDTO);
                                break;
                            case 4:
                                jointOverdraftDTO = new JointOverdraftDTO(getId(),getIBAN(),getLastname(),getFirstname(),getSSN(),getBalance(),getLastname2(), getFirstname2());
                                service.insertAccount(jointOverdraftDTO);
                                break;
                            default:
                                System.out.println("Μη αναγνωρίσημη επλογή");
                                break;
                        }
                        System.out.println();
//                        service.insertAccount(accountDTO);
                        System.out.println("Εισαγωγή Επιτυχής!");
                    } catch (AccountAlreadyExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Εισάγετε το ID του λογαριασμού προς διαγραφή: ");
                        long id = getId();
                        service.deleteAccount(id);
                        System.out.println("Διαγραφή Επιτυχής!");
                    } catch (AccountNotExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Εισάγετε το ID του λογαριασμού που θέλετε να ενημερώσετε και στην συνέχεια τα νέα στοιχεία: ");
                        long id = getId();
                        String type = service.getType(id);
                        Optional<Account> accountOptional = Optional.empty();

                        switch (type){
                            case "Account":
                                accountDTO = new AccountDTO(id,getIBAN(),getLastname(),getFirstname(),getSSN(),getBalance());
                                accountOptional = service.updateAccount(accountDTO);
                                break;
                            case "Joint" :
                                jointDTO = new JointDTO(id,getIBAN(),getLastname(),getFirstname(),getSSN(),getBalance(),getLastname2(), getFirstname2());
                                accountOptional = service.updateAccount(jointDTO);
                                break;
                            case "Overdraft" :
                                overdraftDTO = new OverdraftDTO(id,getIBAN(),getLastname(),getFirstname(),getSSN(),getBalance());
                                accountOptional = service.updateAccount(overdraftDTO);
                                break;
                            case "JointOverdraft" :
                                jointOverdraftDTO = new JointOverdraftDTO(id,getIBAN(),getLastname(),getFirstname(),getSSN(),getBalance(),getLastname2(), getFirstname2());
                                accountOptional = service.updateAccount(jointOverdraftDTO);
                                break;
                            default:
                                break;

                        }
//                      Optional<Account> accountOptional = service.updateAccount(accountDTO);
                        accountOptional.ifPresent(c -> System.out.println("Old account " + c + "was updated!"));
                    } catch (AccountNotExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        long id = getId();
                        Optional<Account> account = service.getOneAccount(id);
                        account.ifPresent(System.out::println);
                    } catch (AccountNotExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        System.out.println("Επιλέξατε κατάθεση.");
                        service.depositAmount(getAmount(), getSSN(), getId());
                        System.out.println("Κατάθεση επιτυχής");
                    }
                    catch (AccountNotExistsException e){
                        System.out.println(e.getMessage());
                    }
                    catch (InvalidSSNException e1){
                        System.out.println(e1.getMessage());
                    }
                    break;
                case 6:
                    try {
                        System.out.println("Επιλέξατε ανάληψη.");
                        service.withdrawAmount(getAmount(),getSSN(),getId());
                        System.out.println("Ανάληψη επιτυχής");
                    }
                    catch (AccountNotExistsException e){
                        System.out.println(e.getMessage());
                    }
                    catch (InvalidSSNException e1){
                        System.out.println(e1.getMessage());
                    }
                    catch (ForbiddenTransactionException e2){
                        System.out.println(e2.getMessage());
                    }
                    break;
                case 7:
                    List<Account> books = service.getAllAccounts();
                    books.forEach(System.out::println);
                    break;
                case 8:
                    System.out.println("Επιλέξατε έξοδο!");
                    break;
                default:
                    System.out.println("Επιλέξτε 1-8");
                    break;
            }

        }while (choice != 8);

    }

    public static void printMenu(){
        System.out.println("Επιλέξτε ένα απο τα παρακάτω");
        System.out.println("1.Εισαγωγή Λογαριασμού");
        System.out.println("2.Διαγραφή Λογαριασμού");
        System.out.println("3.Ενημέρωση Λογαριασμού");
        System.out.println("4.Αναζήτηση Λογαριασμού");
        System.out.println("5.Κατάθεση");
        System.out.println("6.Ανάληψη");
        System.out.println("7.Εκτύπωση Λογαριασμών");
        System.out.println("8.Έξοδος");
    }

    public static int TypeSelect(Scanner in){
        System.out.println("Επιλέξτε τύπο λογαριασμού");
        System.out.println("1.Απλός Λογαριασμός");
        System.out.println("2.Λογαριασμός Joint");
        System.out.println("3.Λογαριασμός Overdraft");
        System.out.println("4.Λογαριασμός JointOverdraft");
        return in.nextInt();
    }

    public static int getChoice(){
        String s = in.next();
        if (isInt(s)) return Integer.parseInt(s);
        return -1;
    }

    public static long getId(){
        System.out.println("Eισάγετε το ID λογαριασμού: ");
        String s = in.next();
        if (isInt(s)) {
            return Integer.parseInt(s);
        }
        return -1;
    }

    public static String getIBAN(){
        System.out.println("Εισάγετε το IBAN: ");
        return in.next();
    }

    public static String getSSN(){
        System.out.println("Εισάγετε το SSN: ");
        return in.next();
    }

    public static double getBalance(){
        System.out.println("Εισάγετε το διαθέσιμο υπόλοιπο: ");
        String s = in.next();
        if (isInt(s)) {
            return Integer.parseInt(s);
        }
        return -1;
    }

    public static String getFirstname(){
        System.out.println("Εισάγετε όνομα Ιδιοκτήτη");
        return in.next();
    }

    public static String getLastname(){
        System.out.println("Εισάγετε επώνυμο Ιδιοκτήτη");
        return in.next();
    }

    public static String getFirstname2(){
        System.out.println("Εισάγετε όνομα Συνιδιοκτήτη");
        return in.next();
    }

    public static String getLastname2(){
        System.out.println("Εισάγετε επώνυμο Συνιδιοκτήτη");
        return in.next();
    }

    public static long getAmount(){
        System.out.println("Εισάγετε ποσό: ");
        String s = in.next();
        if (isInt(s)) {
            return Integer.parseInt(s);
        }
        return -1;
    }


    private static boolean isInt(String s){
        try {
            Integer.parseInt(s);
            return  true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
