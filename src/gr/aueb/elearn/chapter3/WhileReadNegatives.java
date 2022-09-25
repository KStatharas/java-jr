package gr.aueb.elearn.chapter3;

import java.util.Scanner;

public class WhileReadNegatives {

    public static void main(String[] args) {

        Scanner negative = new Scanner(System.in);
        System.out.println("Doste enan akaireo arithmo.");
        int negat = negative.nextInt();

        while(negat<0){
            System.out.println("Arnitikos arithmos. Parakalw eisagete neo.");
            negat = negative.nextInt();
        }
        System.out.println("Thetikos arithmos.Exiting.");

    }

}
