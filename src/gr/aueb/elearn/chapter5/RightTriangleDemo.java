package gr.aueb.elearn.chapter5;

import java.util.Scanner;

public class RightTriangleDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0, b = 0, c = 0;
        final double EPSILON = 0.005;
        boolean isRight = false;

        System.out.println("Dose times gia a,b,c");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = (Math.abs(Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,2))) <= EPSILON;

        System.out.printf("To trigono%seinai orthogonio", (isRight) ? " " : " den ");
    }
}
