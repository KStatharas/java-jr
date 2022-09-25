package gr.aueb.elearn.chapter7;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String s;

        System.out.println("Please insert a string: ");
        s = n.nextLine();


        if(s.contains("u")){
            System.out.println(s.indexOf('u'));
        }
    }
}
