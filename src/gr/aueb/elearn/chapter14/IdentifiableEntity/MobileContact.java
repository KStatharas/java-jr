package gr.aueb.elearn.chapter14.IdentifiableEntity;

public class MobileContact extends AbstractEntity{
    private User user;
    private String phoneNumber;

    public MobileContact(){}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
