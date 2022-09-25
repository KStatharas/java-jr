package gr.aueb.elearn.Askiseis.ch16.service.exception;


import gr.aueb.elearn.Askiseis.ch16.model.Account;

public class AccountAlreadyExistsException extends Exception{
    public AccountAlreadyExistsException(Account account){
        super("The account with ID " + account.getId() + " already exists.");
    }

}
