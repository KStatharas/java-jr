package gr.aueb.elearn.chapter2;

import java.util.Scanner;

/*
* Diabazei apo standard input arithmous, tous prosthetei kai emfanizei to sum
*/

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        int sum;

        System.out.println("Dose 2 ints");
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = num1 + num2;

        System.out.println(num1 + " kai " + num2 + " mas kanei: " + sum);
    }
}
