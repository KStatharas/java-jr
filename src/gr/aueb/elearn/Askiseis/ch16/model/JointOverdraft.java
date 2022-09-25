package gr.aueb.elearn.Askiseis.ch16.model;

public class JointOverdraft extends Joint{

    public JointOverdraft() {
    }

    public JointOverdraft(long id, String iban, String lastname, String firstname, String ssn, double balance, String lastname2, String firstname2) {
        super(id, iban, lastname, firstname, ssn, balance, lastname2, firstname2);
    }

    @Override
    public String toString() {
        return "Joint Account{" +
                "id =" + getId() +
                ", lastname 1='" + getLastname() + '\'' +
                ", firstname 1='" + getFirstname() + '\'' +
                ", lastname 2='" + getLastname2() + '\'' +
                ", firstname 2='" + getFirstname2() + '\'' +
                ", iban='" + getIban() + '\'' +
                ", ssn='" + getSsn() + '\'' +
                ", balance=" + getBalance() +
                '}';
    }
}
