package gr.aueb.elearn.chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LightsDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp;
        boolean isRaining = false;
        boolean isSnowing = false;
        boolean areLightsOn = false;
        boolean isNight = false;


        try {
            System.out.println("Please insert temperature");
            temp = in.nextInt();

            System.out.println("Please insert if it's night (true/false)");
            isNight = in.nextBoolean();

            System.out.println("Please insert if it's raining (true/false)");
            isRaining = in.nextBoolean();

            isSnowing = (temp < 0);
            areLightsOn = ((isRaining || isSnowing) && isNight);

            System.out.printf("Lights are%son\n",areLightsOn ? " " : " not ");

        } catch ( InputMismatchException e) {
            in.nextLine();
            System.out.println("Παρακαλώ εισάγετε έγκυρη θερμοκρασία");
        }
    }
}
