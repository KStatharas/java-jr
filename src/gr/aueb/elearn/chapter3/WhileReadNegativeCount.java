package gr.aueb.elearn.chapter3;

import java.util.Scanner;

public class WhileReadNegativeCount {
    public static void main(String[] args) {
        Scanner negative = new Scanner(System.in);
        System.out.println("Doste enan akaireo arithmo.");
        int negat = negative.nextInt();
        int counter = 0;

        while(negat<0){
            System.out.println("Arnitikos arithmos. Parakalw eisagete neo.");
            negat = negative.nextInt();
            counter++;
        }
        System.out.println("Thetikos arithmos.Exiting.");
        System.out.println("Edoses " + counter + " arnitikous.");
    }
}
