package gr.aueb.elearn.Askiseis.ch16.service;

import gr.aueb.elearn.Askiseis.ch16.dao.IAccountDAO;
import gr.aueb.elearn.Askiseis.ch16.dto.AccountDTO;
import gr.aueb.elearn.Askiseis.ch16.dto.JointDTO;
import gr.aueb.elearn.Askiseis.ch16.dto.JointOverdraftDTO;
import gr.aueb.elearn.Askiseis.ch16.dto.OverdraftDTO;
import gr.aueb.elearn.Askiseis.ch16.model.Account;
import gr.aueb.elearn.Askiseis.ch16.model.Joint;
import gr.aueb.elearn.Askiseis.ch16.model.JointOverdraft;
import gr.aueb.elearn.Askiseis.ch16.model.Overdraft;
import gr.aueb.elearn.Askiseis.ch16.service.exception.AccountAlreadyExistsException;
import gr.aueb.elearn.Askiseis.ch16.service.exception.AccountNotExistsException;
import gr.aueb.elearn.Askiseis.ch16.service.exception.ForbiddenTransactionException;
import gr.aueb.elearn.Askiseis.ch16.service.exception.InvalidSSNException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class AccountServiceImpl implements IAccountService{
    private final IAccountDAO dao;

    public AccountServiceImpl(IAccountDAO dao) {
        this.dao = dao;
    }

    @Override
    public void insertAccount(AccountDTO accountDTO) throws AccountAlreadyExistsException {
        try{
            Account account = convertDTO(accountDTO);
            if (!dao.insert(account)) throw new AccountAlreadyExistsException(account);
        }
        catch (AccountAlreadyExistsException e){
            System.err.println("Account Already Exists error " + LocalDateTime.now());
            throw e;
        }
    }

    @Override
    public void insertAccount(JointDTO jointDTO) throws AccountAlreadyExistsException {
        try{
            Joint joint = convertJointDTO(jointDTO);
            if (!dao.insert(joint)) throw new AccountAlreadyExistsException(joint);
        }
        catch (AccountAlreadyExistsException e){
            System.err.println("Account Already Exists error " + LocalDateTime.now());
            throw e;
        }
    }

    @Override
    public void insertAccount(OverdraftDTO overdraftDTO) throws AccountAlreadyExistsException {
        try{
            Overdraft overdraft = convertOverdraftDTO(overdraftDTO);
            if (!dao.insert(overdraft)) throw new AccountAlreadyExistsException(overdraft);
        }
        catch (AccountAlreadyExistsException e){
            System.err.println("Account Already Exists error " + LocalDateTime.now());
            throw e;
        }
    }

    @Override
    public void insertAccount(JointOverdraftDTO jointOverdraftDTO) throws AccountAlreadyExistsException {
        try{
            JointOverdraft jointOverdraft = convertJointOverdraftDTO(jointOverdraftDTO);
            if (!dao.insert(jointOverdraft)) throw new AccountAlreadyExistsException(jointOverdraft);
        }
        catch (AccountAlreadyExistsException e){
            System.err.println("Account Already Exists error " + LocalDateTime.now());
            throw e;
        }
    }

    @Override
    public void deleteAccount(long id) throws AccountNotExistsException {
        try {
            if (!dao.delete(id)) throw new AccountNotExistsException(id);
        } catch (AccountNotExistsException e) {
            System.err.println("Account Not Exists Exception");
            throw e;
        }
    }

    @Override
    public List<Account> getAllAccounts() {
        return dao.getAll();
    }

    @Override
    public Optional<Account> getOneAccount(long id) throws AccountNotExistsException {

        try {
            Optional<Account> accFetch = dao.getOne(id);
            if(!accFetch.isPresent()) throw new AccountNotExistsException(id);
            else return accFetch;

        } catch (AccountNotExistsException e) {
            System.err.println("Account Not Exists Exception");
            throw e;

        }
    }

    @Override
    public void depositAmount(long amount, String ssn, long id)throws AccountNotExistsException,InvalidSSNException {
        try {
            dao.deposit(amount,ssn,id);
        } catch (AccountNotExistsException e) {
            System.err.println("Account Not Exists Exception");
            throw  e;
        } catch (InvalidSSNException e1) {
            System.err.println("Invalid SSN");
            throw  e1;
        }

    }

    @Override
    public void withdrawAmount(long amount, String ssn, long id) throws AccountNotExistsException,InvalidSSNException,ForbiddenTransactionException {
        try {
            dao.withdraw(amount,ssn,id);
        } catch (AccountNotExistsException e) {
            System.err.println("Account Not Exists Exception");
            throw  e;
        } catch (InvalidSSNException e1) {
            System.err.println("Invalid SSN");
            throw  e1;
        } catch (ForbiddenTransactionException e2){
            System.err.println("Insufficient Balance");
            throw e2;
        }
    }

    @Override
    public Optional<Account> updateAccount(AccountDTO accountDTO) throws AccountNotExistsException{
        try {
            Account account = convertDTO(accountDTO);
            Optional<Account> accUpdate = dao.update(account);
            if(!accUpdate.isPresent()) throw new AccountNotExistsException(account);
            else return accUpdate;
        } catch (AccountNotExistsException e) {
            System.err.println("Account Not Exists Exception");
            throw e;
        }
    }

    @Override
    public Optional<Account> updateAccount(JointDTO jointDTO) throws AccountNotExistsException{
        try {
            Joint joint = convertJointDTO(jointDTO);
            Optional<Account> accUpdate = dao.update(joint);
            if(!accUpdate.isPresent()) throw new AccountNotExistsException(joint);
            else return accUpdate;
        } catch (AccountNotExistsException e) {
            System.err.println("Account Not Exists Exception");
            throw e;
        }
    }

    @Override
    public Optional<Account> updateAccount(OverdraftDTO overdraftDTO) throws AccountNotExistsException{
        try {
            Overdraft overdraft = convertOverdraftDTO(overdraftDTO);
            Optional<Account> accUpdate = dao.update(overdraft);
            if(!accUpdate.isPresent()) throw new AccountNotExistsException(overdraft);
            else return accUpdate;
        } catch (AccountNotExistsException e) {
            System.err.println("Account Not Exists Exception");
            throw e;
        }
    }

    @Override
    public Optional<Account> updateAccount(JointOverdraftDTO jointOverdraftDTO) throws AccountNotExistsException{
        try {
            JointOverdraft jointOverdraft = convertJointOverdraftDTO(jointOverdraftDTO);
            Optional<Account> accUpdate = dao.update(jointOverdraft);
            if(!accUpdate.isPresent()) throw new AccountNotExistsException(jointOverdraft);
            else return accUpdate;
        } catch (AccountNotExistsException e) {
            System.err.println("Account Not Exists Exception");
            throw e;
        }
    }




    private Account convertDTO(AccountDTO accountDTO){
        return new Account(accountDTO.getId(), accountDTO.getIban(), accountDTO.getLastname(), accountDTO.getFirstname(), accountDTO.getSsn(), accountDTO.getBalance());
    }

    private Joint convertJointDTO(JointDTO jointDTO){
        return new Joint(jointDTO.getId(), jointDTO.getIban(), jointDTO.getLastname(), jointDTO.getFirstname(), jointDTO.getSsn(), jointDTO.getBalance(), jointDTO.getLastname2(), jointDTO.getFirstname2());
    }

    private Overdraft convertOverdraftDTO(OverdraftDTO overdraftDTO){
        return new Overdraft(overdraftDTO.getId(), overdraftDTO.getIban(), overdraftDTO.getLastname(), overdraftDTO.getFirstname(), overdraftDTO.getSsn(), overdraftDTO.getBalance());
    }

    private JointOverdraft convertJointOverdraftDTO (JointOverdraftDTO jointOverdraftDTO){
        return new JointOverdraft(jointOverdraftDTO.getId(), jointOverdraftDTO.getIban(), jointOverdraftDTO.getLastname(), jointOverdraftDTO.getFirstname(), jointOverdraftDTO.getSsn(), jointOverdraftDTO.getBalance(), jointOverdraftDTO.getLastname2(), jointOverdraftDTO.getFirstname2());
    }

    public String getType(long id) throws AccountNotExistsException{
            Optional<Account> acc = getOneAccount(id);
            return acc.get().getClass().getSimpleName();
    }

}
