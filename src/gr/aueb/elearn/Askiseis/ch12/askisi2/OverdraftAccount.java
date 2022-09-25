package gr.aueb.elearn.Askiseis.ch12.askisi2;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class OverdraftAccount extends Account {

    OverdraftAccount() {
        super();
        System.out.println("Overdraft Account was created!");
    }

    OverdraftAccount(long id, String iban, String lastname, String firstname, String ssn, double balance) {
        super(id, iban, lastname, firstname, ssn, balance);
        System.out.println("Overdraft Account was created!");
    }

    private boolean isSSnVald(String ssn) {
        return getSsn().equals(ssn);
    }

    private void logErrorMessage(PrintStream ps, String message) {
        ps.println(message);
    }

    @Override
    public void withdraw(double amount, String ssn) throws FileNotFoundException {
        if (!isSSnVald(ssn)) {
            logErrorMessage(new PrintStream("C:\\Users\\Mutantin\\IdeaProjects\\java-jr\\src\\gr\\aueb\\elearn\\Askiseis\\ch12\\askisi2\\logAccount.txt"), "Invalid ssn!");
            return;
        }
            setBalance(getBalance()-amount);

    }

    @Override
    public String getAccountState(){
        return "Id: " + getId() + " Firstname: " + getFirstname() + ", Lastname: " + getLastname() + ", Iban: " + getIban() + ", Ssn: " + getSsn() + ", Balance: " + getBalance();
    }
}
