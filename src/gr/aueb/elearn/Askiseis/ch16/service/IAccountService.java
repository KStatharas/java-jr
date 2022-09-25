package gr.aueb.elearn.Askiseis.ch16.service;

import gr.aueb.elearn.Askiseis.ch16.dto.AccountDTO;
import gr.aueb.elearn.Askiseis.ch16.dto.JointDTO;
import gr.aueb.elearn.Askiseis.ch16.dto.JointOverdraftDTO;
import gr.aueb.elearn.Askiseis.ch16.dto.OverdraftDTO;
import gr.aueb.elearn.Askiseis.ch16.model.Account;
import gr.aueb.elearn.Askiseis.ch16.model.Overdraft;
import gr.aueb.elearn.Askiseis.ch16.service.exception.AccountAlreadyExistsException;
import gr.aueb.elearn.Askiseis.ch16.service.exception.AccountNotExistsException;
import gr.aueb.elearn.Askiseis.ch16.service.exception.ForbiddenTransactionException;
import gr.aueb.elearn.Askiseis.ch16.service.exception.InvalidSSNException;

import java.util.List;
import java.util.Optional;

public interface IAccountService {

    void insertAccount(AccountDTO accountDTO) throws AccountAlreadyExistsException;
    void insertAccount(JointDTO jointDTO) throws AccountAlreadyExistsException;
    void insertAccount(OverdraftDTO overdraftDTO) throws AccountAlreadyExistsException;
    void insertAccount(JointOverdraftDTO jointOverdraftDTO) throws AccountAlreadyExistsException;
    void deleteAccount(long id) throws AccountNotExistsException;
    List<Account> getAllAccounts();
    Optional<Account> getOneAccount(long id) throws AccountNotExistsException;
    void depositAmount(long amount, String ssn, long id) throws InvalidSSNException, AccountNotExistsException;
    void withdrawAmount(long amount, String ssn, long id) throws ForbiddenTransactionException, InvalidSSNException, AccountNotExistsException;
    Optional<Account> updateAccount(AccountDTO accountDTO) throws AccountNotExistsException;
    Optional<Account> updateAccount(JointDTO jointDTO) throws AccountNotExistsException;
    Optional<Account> updateAccount(OverdraftDTO overdraftDTO) throws AccountNotExistsException;
    Optional<Account> updateAccount(JointOverdraftDTO jointOverdraftDTO) throws AccountNotExistsException;
    String getType(long id) throws AccountNotExistsException;
}
