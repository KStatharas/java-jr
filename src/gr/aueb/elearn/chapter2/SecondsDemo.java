package gr.aueb.elearn.chapter2;

import java.util.Scanner;

public class SecondsDemo {

    public static void main(String[] args) {

        Scanner inputSeconds = new Scanner(System.in);
        System.out.println("Dose seconds: ");

            int seconds = inputSeconds.nextInt();
            int days = seconds / (24*3600);
            seconds = seconds % (24*3600);
            int hours = seconds / 3600;
            seconds = seconds % 3600;
            int mins = seconds / 60;
            int fseconds = seconds % 60;

        System.out.printf("Days: %d, Hours: %d, mins: %d, seconds: %d", days,hours,mins,fseconds);

    }
}
