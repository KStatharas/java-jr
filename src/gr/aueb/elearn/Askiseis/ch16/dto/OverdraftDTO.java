package gr.aueb.elearn.Askiseis.ch16.dto;

public class OverdraftDTO extends AccountDTO {
    public OverdraftDTO(){
        super();
    }

    public OverdraftDTO(long id, String iban, String lastname, String firstname, String ssn, double balance) {
        super(id, iban, lastname, firstname, ssn, balance);
    }
}
