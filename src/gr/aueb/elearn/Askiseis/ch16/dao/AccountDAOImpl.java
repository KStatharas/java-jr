package gr.aueb.elearn.Askiseis.ch16.dao;

import gr.aueb.elearn.Askiseis.ch16.model.Account;
import gr.aueb.elearn.Askiseis.ch16.model.Joint;
import gr.aueb.elearn.Askiseis.ch16.model.JointOverdraft;
import gr.aueb.elearn.Askiseis.ch16.model.Overdraft;
import gr.aueb.elearn.Askiseis.ch16.service.exception.AccountNotExistsException;
import gr.aueb.elearn.Askiseis.ch16.service.exception.ForbiddenTransactionException;
import gr.aueb.elearn.Askiseis.ch16.service.exception.InvalidSSNException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO {
    private static final List<Account> bankDB = new ArrayList<>();

    @Override
    public boolean insert(Account account) {
        if (account == null || bankDB.contains(account)){
            return false;
        }
        System.out.println(account.getClass().getSimpleName());
        bankDB.add(account);
        return true;
    }

//    @Override
//    public boolean insert(Joint joint) {
//        if (joint == null || bankDB.contains(joint)){
//            return false;
//        }
//        bankDB.add(joint);
//        return true;
//    }
//
//    @Override
//    public boolean insert(Overdraft overdraft) {
//        if (overdraft == null || bankDB.contains(overdraft)){
//            return false;
//        }
//        bankDB.add(overdraft);
//        return true;
//    }
//
//    @Override
//    public boolean insert(JointOverdraft jointOverdraft) {
//        if (jointOverdraft == null || bankDB.contains(jointOverdraft)){
//            return false;
//        }
//        bankDB.add(jointOverdraft);
//        return true;
//    }

    @Override
    public boolean delete(long id) {
        int posToDelete = getPosition(id);
        if (posToDelete != -1){
            bankDB.remove(posToDelete);
            return true;
        }
        else return false;
    }

    @Override
    public List<Account> getAll() {

        return new ArrayList<Account>(bankDB);
    }

    @Override
    public Optional<Account> getOne(long id) {
        int posToReturn = getPosition(id);
        if (posToReturn != -1){
            return Optional.of(bankDB.get(posToReturn));
        }
        else return Optional.empty();
    }

    @Override
    public boolean deposit(long amount, String ssn, long id) throws AccountNotExistsException, InvalidSSNException {
        int tPos = getPosition(id);
        if (tPos == -1 ){
            throw new AccountNotExistsException(id);
        }
        Account account = bankDB.get(tPos);

        if (!isSSnVald(ssn,account)) {
            throw new InvalidSSNException(account);
        }


        double newBalance = account.getBalance()+amount;
        account.setBalance(newBalance);
        return true;
    }

    @Override
    public boolean withdraw(long amount, String ssn, long id) throws AccountNotExistsException, InvalidSSNException, ForbiddenTransactionException {

        int tPos = getPosition(id);
        if (tPos == -1 ){
            throw new AccountNotExistsException(id);
        }
        Account account = bankDB.get(tPos);

        if (!isSSnVald(ssn,account)) {
            throw new InvalidSSNException(account);
        }

        System.out.println(account.getClass().getSimpleName());
        if (!(account instanceof Overdraft) && !(account instanceof JointOverdraft)){
            if (amount > account.getBalance() ) {
                throw new ForbiddenTransactionException(account);
            }
        }

        double newBalance = account.getBalance() - amount;
        account.setBalance(newBalance);
        return true;
    }

    @Override
    public Optional<Account> update(Account account) {
        int posToUpdate = -1;
        if (account == null) return Optional.empty();

        posToUpdate = getPosition(account.getId());
        if(posToUpdate != -1){
            Account accToReturn = bankDB.get(posToUpdate);
            bankDB.set(posToUpdate,account);
            return  Optional.of(accToReturn);
        }

        return Optional.empty();
    }

    private boolean isSSnVald(String ssn, Account account){
        return  account.getSsn().equals(ssn);
    }

    private int getPosition(long id){
        int getPos = -1;
        for (int i = 0; i < bankDB.size(); i++) {
            if(bankDB.get(i).getId() == id){
                getPos = i;
                break;
            }
        }
        return getPos;
    }
}
