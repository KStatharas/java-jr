package gr.aueb.elearn.chapter7;

import java.util.Scanner;

public class StringInit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = "Hello";
        System.out.println(s1);
        System.out.printf("%s",s1);

        System.out.println("Please insert a string: ");
        String s2 = sc.next();
        System.out.println("Echo: " + s2);

        System.out.println("Please insert a string: ");
        String s3 = sc.nextLine();
        System.out.println("Echo: " + s3);
    }
}
