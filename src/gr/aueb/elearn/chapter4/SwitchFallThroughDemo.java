package gr.aueb.elearn.chapter4;

//lamabanei enan bathmo and shows output

import java.util.Scanner;

public class SwitchFallThroughDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade;

        System.out.println("Parakalw eisagete enan arithmo 1-10: ");
        grade = in.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Apotyxia.");
                break;
            case 5:
            case 6:
                System.out.println("Kalws.");
                break;
            case 7:
            case 8:
                System.out.println("Lian Kalws.");
                break;
            case 9:
            case 10:
                System.out.println("Arista.");
                break;
            default:
                System.out.println("Parakalw eisagete enan arithmo 1-10: ");
                break;
        }
    }

}
