package gr.aueb.elearn.chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2;

        try {
            System.out.println("Insert to ints");
            num1 = in.nextInt();
            num2 = in.nextInt();

            int result = num1 / num2;

            System.out.println(result);
        }
        catch (ArithmeticException e){
//            e.printStackTrace();
            System.out.println("Lathos dieraisis me to 0");
        }
        catch (InputMismatchException e2){
            System.out.println("Esagete mono akeraious");
        }
        catch (Exception e3){
            System.out.println("Oops error");
        }
    }
}
