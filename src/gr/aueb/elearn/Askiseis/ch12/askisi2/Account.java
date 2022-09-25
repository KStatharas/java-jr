package gr.aueb.elearn.Askiseis.ch12.askisi2;

import java.io.PrintStream;

public class Account {
    private  long id;
    private String iban;
    private String lastname;
    private String firstname;
    private String ssn;
    private  double balance;

    public Account(){};

    public Account(long id, String iban, String lastname, String firstname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.lastname = lastname;
        this.firstname = firstname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit (double amount) throws Exception {
        if (amount > 0){
            balance += amount;
        }
        else {
            // do something!
            try {
                throw new Exception("Negative amount");
            } catch (Exception e) {
                System.out.println("negative amount");
                throw e;
            }
        }
    }
/**
 * Withdraws a certain amount of money from the account.
 * @param amount  The amount of money to withdraw
 * @throws Exception if Insufficient balance
 * **/
    public void withdraw (double amount ,String ssn) throws Exception {
        if (!isSSnVald(ssn)){
            logErrorMessage(new PrintStream("C:\\Users\\Mutantin\\IdeaProjects\\java-jr\\src\\gr\\aueb\\elearn\\Askiseis\\ch12\\askisi2\\logAccount.txt"),"Invalid ssn!");
            return;
        }
        if (amount <= balance){
            balance -= amount;
        }
        else {
            // do something!
            try {
                throw new Exception("Insufficient amount");
            } catch (Exception e) {
                System.out.println("Insufficient amount");
                logErrorMessage(new PrintStream("C:\\Users\\Mutantin\\IdeaProjects\\java-jr\\src\\gr\\aueb\\elearn\\Askiseis\\ch12\\askisi2\\logAccount.txt"),"Insufficient balance");
                throw e;
            }
        }
    }

    public double getAmountBalance() {
        return getBalance() ;
    }

    public String getAccountState(){
        return "Id: " + id + " Firstname: " + firstname + ", Lastname: " + lastname + ", Iban: " + iban + ", Ssn: " + ssn + ", Balance: " + balance;
    }

    private void logErrorMessage(PrintStream ps, String message){
        ps.println(message);
    }

    private boolean isSSnVald(String ssn){
//        if (ssn != null) return false;
        return  this.ssn.equals(ssn);
    }
}
