package gr.aueb.elearn.Askiseis.ch16.model;

import java.util.Objects;

public class Account {
    private  long id;
    private String iban;
    private String lastname;
    private String firstname;
    private String ssn;
    private  double balance;

    public Account(){}

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

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", iban='" + iban + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", ssn='" + ssn + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account that = (Account) o;
        return getId() == that.getId() && Double.compare(that.getBalance(), getBalance()) == 0 && getIban().equals(that.getIban()) && getLastname().equals(that.getLastname()) && getFirstname().equals(that.getFirstname()) && getSsn().equals(that.getSsn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getIban(), getLastname(), getFirstname(), getSsn(), getBalance());
    }


}
