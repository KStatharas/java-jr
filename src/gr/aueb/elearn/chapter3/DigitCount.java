package gr.aueb.elearn.chapter3;

import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0, count = 0;
        System.out.println("Dose enan akeraio: ");
        int result = input.nextInt();

        do {
            result = result/10;
            count++;
        }while (result!=0);

        System.out.println("To plithos twn psifiwn einai: " + count);
    }
}
