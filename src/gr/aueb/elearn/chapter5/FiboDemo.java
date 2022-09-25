package gr.aueb.elearn.chapter5;

import java.util.Scanner;

public class FiboDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dose enan akeraio thetiko: ");
        System.out.println("Fibo is : " + fibo(in.nextInt()));
    }

    public static int fibo(int n){

            return (n<=1)? n : fibo(n-1) + fibo(n-2);

    }
}
