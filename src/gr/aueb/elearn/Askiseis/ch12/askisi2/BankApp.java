package gr.aueb.elearn.Askiseis.ch12.askisi2;

public class BankApp {
    public static void main(String[] args) throws Exception {

        /**
         * Testing the Overdraft Account (withdrawing an amount bigger than balance which normally would throw an exception) :
         * **/
        Account ac1 = new OverdraftAccount(121212,"123","Stats","Kos","123",12300.00);
        System.out.println(ac1.getAccountState());
        ac1.withdraw(14000,"123");
        System.out.println(ac1.getAccountState());
        System.out.println();

        /**
         * Testing the Joint Account (2 users own the account) :
         * **/
        Account ac2 = new JointAccount(111,"3332123","Bonde","Carles","2121",50100.00,222,"Zara","Sylvia");
        System.out.println(ac2.getAccountState());
        System.out.println();

        /**
         * Testing the parent Account class (should throw an Insufficient amount exception because of withdrawing more than balance) :
         * In order to get a log text file, change the output path in Account class
         * **/
        System.out.println("Account class: ");
        Account ac3 = new Account(882261,"010101","Bob","Josh","333",1000.00);
        ac3.withdraw(5000.00,"333");
    }
}
