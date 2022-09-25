package gr.aueb.elearn.Askiseis.ch16.dto;

public class JointOverdraftDTO extends JointDTO {
    public JointOverdraftDTO() {
    }

    public JointOverdraftDTO(long id, String iban, String lastname, String firstname, String ssn, double balance, String lastname2, String firstname2) {
        super(id, iban, lastname, firstname, ssn, balance, lastname2, firstname2);
    }
}
