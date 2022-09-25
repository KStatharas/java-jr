package gr.aueb.elearn.Askiseis.ch16.service.exception;

import gr.aueb.elearn.Askiseis.ch16.model.Account;

public class AccountNotExistsException extends Exception{

    public AccountNotExistsException (Account account){
        super("Account with ID " + account.getId() + " does not exist.");
    }

    public AccountNotExistsException (long id){
        super("Account with ID " + id + " does not exist.");
    }
}
