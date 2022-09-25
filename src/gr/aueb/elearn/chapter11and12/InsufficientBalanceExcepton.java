package gr.aueb.elearn.chapter11and12;

public class InsufficientBalanceExcepton extends Exception{
    public InsufficientBalanceExcepton (double balance, double amount){
        super("Insufficent balance" + amount);
    }
}
