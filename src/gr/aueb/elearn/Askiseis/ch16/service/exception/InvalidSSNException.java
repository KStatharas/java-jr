package gr.aueb.elearn.Askiseis.ch16.service.exception;


import gr.aueb.elearn.Askiseis.ch16.model.Account;

public class InvalidSSNException extends Exception{
    public InvalidSSNException(Account account) {
        super("SSN: "+ account.getSsn() + " is invalid");
    }
}
