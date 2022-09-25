package gr.aueb.elearn.Askiseis.ch16.service.exception;

import gr.aueb.elearn.Askiseis.ch16.model.Account;

public class ForbiddenTransactionException extends Exception{
    public ForbiddenTransactionException(Account account) {
        super("This transaction is not allowed on account with ID: " + account.getId() +". (Not Overdraft type account)");
    }
}
