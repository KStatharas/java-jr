package gr.aueb.elearn.chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionFinallyScanner {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in);) {
            int i = in.nextInt();
            System.out.println("You nserted: " + i);
        } catch (InputMismatchException e) {
            System.out.println("Please insert an int: ");
            throw e;
        }
//        finally {
//            try {
//                in.close();
//            } catch (Exception e) {
//                System.out.println("IO Exception");
//            }
//        }
    }
}
