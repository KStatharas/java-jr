package gr.aueb.elearn.chapter8;

import java.util.Scanner;

public class DataValidationDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strNum;
        int num;

        while (true){
            System.out.println("Please insert an int: ");
            strNum = in.next();
            if (isInt(strNum)) {
                num = Integer.parseInt(strNum);
                if (num == 0) break;
                System.out.println("You inserted " + num);
            }
            else{
                System.out.println("Not int");
            }



        }
    }
    public static boolean isInt(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return  false;
        }
    }


}
