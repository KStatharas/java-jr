package gr.aueb.elearn.chapter8;

import java.util.Scanner;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String s = null;

        if(s.equals("Hello")){
            System.out.println("Hello");
        }
    }
}
