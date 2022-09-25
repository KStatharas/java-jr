package gr.aueb.elearn.Askiseis.ch16.model;

public class Overdraft extends Account {

    public Overdraft(){
        super();
    }

    public Overdraft(long id, String iban, String lastname, String firstname, String ssn, double balance) {
        super(id, iban, lastname, firstname, ssn, balance);
    }

    @Override
    public String toString() {
        return "Overdraft Account{" +
                "id=" + getId() +
                ", iban='" + getIban() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                ", firstname='" + getFirstname() + '\'' +
                ", ssn='" + getSsn() + '\'' +
                ", balance=" + getBalance() +
                '}';
    }





}
