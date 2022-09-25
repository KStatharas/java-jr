package gr.aueb.elearn.chapter5;

import java.util.Scanner;

public class MethodMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            printMenu();
            choice = in.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Eisagogi success");
                    break;
                case 2:
                    System.out.println("Diagrafi success");
                    break;
                case 3:
                    System.out.println("Enimerosi success");
                    break;
                case 4:
                    System.out.println("Anazitisi success");
                    break;
                case 5:
                    System.out.println("Eksodos success");
                    break;
            }
        }while (choice!=5);
    }

    public static void printMenu() {
        System.out.println("Epilekste ena apo ta parakatw: ");
        System.out.println("1. Eisagogi");
        System.out.println("2. Diagrafi");
        System.out.println("3. Enimerosi");
        System.out.println("4. Anazitisi");
        System.out.println("5. Eksodos");
    }
}
