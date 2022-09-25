package gr.aueb.elearn.chapter3;

import java.util.Scanner;

public class AbsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dose enan akeraio: ");
        System.out.println("O apolytos arithmos einai: " + Math.abs(input.nextInt()));
    }
}
