package gr.aueb.elearn.Askiseis.ch16.dao;

import gr.aueb.elearn.Askiseis.ch16.model.Account;
import gr.aueb.elearn.Askiseis.ch16.model.Joint;
import gr.aueb.elearn.Askiseis.ch16.model.JointOverdraft;
import gr.aueb.elearn.Askiseis.ch16.model.Overdraft;
import gr.aueb.elearn.Askiseis.ch16.service.exception.AccountAlreadyExistsException;
import gr.aueb.elearn.Askiseis.ch16.service.exception.AccountNotExistsException;
import gr.aueb.elearn.Askiseis.ch16.service.exception.ForbiddenTransactionException;
import gr.aueb.elearn.Askiseis.ch16.service.exception.InvalidSSNException;

import java.util.List;
import java.util.Optional;

public interface IAccountDAO {

    boolean insert(Account account);
    boolean delete(long id);
    List<Account> getAll();
    Optional<Account> getOne(long id);
    boolean deposit(long amount, String ssn, long id) throws InvalidSSNException, AccountNotExistsException;
    boolean withdraw (long amount, String ssn, long id) throws ForbiddenTransactionException, InvalidSSNException, AccountNotExistsException;
    Optional<Account> update(Account account);
}
