package gr.aueb.elearn.chapter2;

// euro to dollar

import java.util.Scanner;

public class EuroToDollarDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int RATE = 116;
        int inputEuros = 0;
        int totalUSACents = 0;
        int usaDollars = 0;
        int usaCents = 0;

        System.out.println("Parakalw eisagete to poso se euro");
        inputEuros = in.nextInt();
        totalUSACents = inputEuros * RATE;
        usaDollars = totalUSACents / 100;
        usaCents = totalUSACents % 100;

        System.out.printf("%d Euros = %d Dollars, %d cents",inputEuros,usaDollars,usaCents);
    }
}
