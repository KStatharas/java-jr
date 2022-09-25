package gr.aueb.elearn.Askiseis.ch12.askisi2;

public class JointAccount extends Account {

    private  long id2;
    private String lastname2;
    private String firstname2;

    JointAccount() {
        super();
        System.out.println("Jointaccount was created!");
    }

    JointAccount(long id, String iban, String lastname, String firstname, String ssn, double balance,long id2, String lastname2, String firstname2) {
        super(id, iban, lastname, firstname, ssn, balance);
        this.id2 = id2;
        this.lastname2 = lastname2;
        this.firstname2 = firstname2;
        System.out.println("Jointaccount was created!");
    }

    @Override
    public String getAccountState(){
        return "Id 1: " + getId() + " Firstname 1: " + getFirstname() + ", Lastname 1: " + getLastname() + " Id 2: " + id2 + " Firstname 2: " + firstname2 + ", Lastname 2: " + lastname2 + ", Iban: " + getIban() + ", Ssn: " + getSsn() + ", Balance: " + getAmountBalance();
    }
}
