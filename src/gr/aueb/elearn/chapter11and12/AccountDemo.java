package gr.aueb.elearn.chapter11and12;

public class AccountDemo {

    public static void main(String[] args) {
        Account alice = new Account();
        Account bob = new Account(1,"GR123","Dylan","Bob","123",1000);


        try {
            bob.deposit(1000);
            bob.withdraw(500,"123");
            System.out.println(bob.getAccountState());

        } catch (Exception e) {
            System.out.println("Something went wrong with the transcation...");
        }
    }
}
