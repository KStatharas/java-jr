package gr.aueb.elearn.Askiseis.ch17.model;

public class Account extends AbstractEntity implements IdentifiableEntity {
    private long id;
    private String iban;
    private User holder;
    private double balance;

    public Account() {
    }

    public Account(long id, String iban, User holder, double balance) {
        this.id = id;
        this.iban = iban;
        this.holder = holder;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public User getHolder() {
        return holder;
    }

    public void setHolder(User holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", holder=" + holder +
                ", balance=" + balance +
                '}';
    }
}
