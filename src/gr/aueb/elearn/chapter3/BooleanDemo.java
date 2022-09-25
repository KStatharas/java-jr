package gr.aueb.elearn.chapter3;

import java.util.Scanner;

public class BooleanDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false, isSnowing = false;
        int temperature = 0;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();
        System.out.println("Please insert temperature");
        temperature = in.nextInt();

        isSnowing = isRaining && (temperature<0);

        System.out.printf("isSnowing: %s",(isSnowing)?"YES":"NO");
    }
}
