package gr.aueb.elearn.chapter5;

import java.util.Scanner;

public class powerRecursive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dose dyo arithmous: ");
        int first = in.nextInt();
        int second = in.nextInt();
        System.out.println("Apotelesma of pow : " + pow(first,second));
    }

    public static int pow (int a, int b){
       return (b==0)? 1 : a * pow(a,b-1);
    }
}
