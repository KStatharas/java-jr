package gr.aueb.elearn.chapter5;

import java.util.Scanner;

public class FactorialMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dose enan akeraio: ");
        int fact = input.nextInt();
        System.out.println("To apotelesma einai: " + factorial(fact));

    }

    public static int factorial(int n){
        return n==1 ? 1 :  n * factorial(n-1);
    }
}

