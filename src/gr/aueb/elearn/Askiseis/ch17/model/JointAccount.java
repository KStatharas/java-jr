package gr.aueb.elearn.Askiseis.ch17.model;

public class JointAccount extends AbstractEntity implements IdentifiableEntity {

    private User firstHolder;
    private User secondHolder;
    private String iban;
    private double balance;

    public JointAccount(){}

    public JointAccount(long id, User firstHolder, User secondHolder, String iban, double balance) {
        super.setId(id);
        this.firstHolder = firstHolder;
        this.secondHolder = secondHolder;
        this.iban = iban;
        this.balance = balance;
    }

    public User getFirstHolder() {
        return firstHolder;
    }

    public void setFirstHolder(User firstHolder) {
        this.firstHolder = firstHolder;
    }

    public User getSecondHolder() {
        return secondHolder;
    }

    public void setSecondHolder(User secondHolder) {
        this.secondHolder = secondHolder;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "JointAccount{" +
                "firstHolder=" + firstHolder +
                ", secondHolder=" + secondHolder +
                ", iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }
}
