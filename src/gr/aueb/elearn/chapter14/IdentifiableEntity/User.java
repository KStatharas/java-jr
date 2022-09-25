package gr.aueb.elearn.chapter14.IdentifiableEntity;

public class User extends AbstractEntity{
    private String firstname;
    private String lastname;

    public User(){}

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
