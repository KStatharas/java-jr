package gr.aueb.elearn.Askiseis.ch16.dto;

public class JointDTO extends AccountDTO {
    private String lastname2;
    private String firstname2;


    public JointDTO() {}

    public JointDTO(long id, String iban, String lastname, String firstname, String ssn, double balance, String lastname2, String firstname2) {
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


}
