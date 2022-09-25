package gr.aueb.elearn.chapter3;

import java.util.Scanner;

public class EvenDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dose enan akeraio: ");
        int num = input.nextInt();
        boolean isEven = num % 2 == 0;
        System.out.printf("IsEven: %b",isEven);

    }
}
