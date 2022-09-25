package gr.aueb.elearn.chapter5;

import java.util.Scanner;

public class DoubleFloatPrintF {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double d = 0.0;
        float f = 0.0F;
        double result = 0.00;

        System.out.println("Doste dyo dekadikous");
        d = in.nextDouble();
        f = in.nextFloat();


        result = d / f;

        System.out.println("Result: " + result);



    }
}
