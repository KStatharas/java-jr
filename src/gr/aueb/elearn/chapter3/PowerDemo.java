package gr.aueb.elearn.chapter3;

import java.util.Scanner;

public class PowerDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dose 2 akaireous a kai b: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("To a ypsomeno sto b einai: " + Math.pow(a,b));
    }
}
