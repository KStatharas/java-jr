package gr.aueb.elearn.chapter2;
import java.util.Scanner;

/* euro amount -> euro 500 , 100, 20, 10 and coins of 1 euro */

public class EuroDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int euro500 = 0, euro100 = 0, euro50 = 0;
        int euro20 = 0, euro10 = 0;
        int remainingEuros = 0;

        System.out.println("Parakalw doste to poso se euro: ");
        remainingEuros =  in.nextInt();

        euro500 = remainingEuros / 500;
        remainingEuros = remainingEuros % 500;

        euro100 = remainingEuros / 100;
        remainingEuros = remainingEuros % 100;

        euro50 = remainingEuros / 50;
        remainingEuros = remainingEuros % 50;

        euro20 = remainingEuros / 20;
        remainingEuros = remainingEuros % 20;

        euro10 = remainingEuros / 10;
        remainingEuros = remainingEuros % 10;

        System.out.printf("EURO500: %d, EURO100: %d, EURO50: %d, EURO20: %d, EURO10: %d", euro500,euro100,euro50,euro20,euro10 );
    }
}
