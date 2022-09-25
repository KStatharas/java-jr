package gr.aueb.elearn.chapter5;

import java.util.Scanner;

public class EvenDemo {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Dose enan arithmo akeraio: ");
        System.out.printf("O arithmos einai %s", isEven(n.nextInt())? "Artios" : "Perittos");
    }

    public static boolean isEven(int a) {
        return (a % 2 == 0);
    }
}
