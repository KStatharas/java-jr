package gr.aueb.elearn.Askiseis.ch16.model;

import java.util.Objects;

public class Joint extends Account{
    private String lastname2;
    private String firstname2;


    public Joint() {}

    public Joint(long id, String iban, String lastname, String firstname, String ssn, double balance, String lastname2, String firstname2) {
        super(id, iban, lastname, firstname, ssn, balance);
        this.lastname2 = lastname2;
        this.firstname2 = firstname2;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public String getFirstname2() {
        return firstname2;
    }

    public void setFirstname2(String firstname2) {
        this.firstname2 = firstname2;
    }

    @Override
    public String toString() {
        return "Joint Account{" +
                "id =" + getId() +
                ", lastname 1='" + getLastname() + '\'' +
                ", firstname 1='" + getFirstname() + '\'' +
                ", lastname 2='" + this.lastname2 + '\'' +
                ", firstname 2='" + this.firstname2 + '\'' +
                ", iban='" + getIban() + '\'' +
                ", ssn='" + getSsn() + '\'' +
                ", balance=" + getBalance() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Joint joint = (Joint) o;
        return getLastname2().equals(joint.getLastname2()) && getFirstname2().equals(joint.getFirstname2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLastname2(), getFirstname2());
    }
}
