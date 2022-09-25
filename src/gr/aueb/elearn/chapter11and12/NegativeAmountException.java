package gr.aueb.elearn.chapter11and12;

public class NegativeAmountException extends Exception{

    public NegativeAmountException (double balance, double amount){
        super("negative amount: " + amount);
    }

}
