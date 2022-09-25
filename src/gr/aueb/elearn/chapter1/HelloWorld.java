package gr.aueb.elearn.chapter1;
import java.beans.Expression;
import java.lang.*;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hello world");
        String hello = "Hello world ";
        for (int i=1; i<6; i++){
            int random = (int)(Math.random()*50);
            System.out.println(hello + i);
            System.out.println("random int is " + random);
        }
        game1();

    }

    private static void output(int num, int random1) {
        if (num==0){
            System.out.println("Exit command inserted.");
            return;
        }
        if (num < random1) {
            System.out.println("Your number is lower than the correct!");
        } else if (num > random1) {
            System.out.println("Your number is higher than the correct!");
        } else {
            System.out.println("Your number is the correct!!");
        }
    }

    private static void game1(){
        System.out.println("What is the secret number? Give me a number between 1-10 or 0 to exit");
        int inp = getInput();
        int secretNum = (int)(Math.random()*10);
        output(inp,secretNum);

        while (inp!=secretNum){
            if (inp==0){
                System.out.println("Exit complete.");
                break;
            }
            System.out.println("Try again (0 to exit).");
            inp = getInput();
            output(inp,secretNum);

        }
    }
    private static int getInput(){
        while(true){
            Scanner objNum = new Scanner(System.in);
            try{
                int input = objNum.nextInt();
                return input;
            }
            catch (Exception e){
                System.out.println(e);
                objNum.next();
                continue;
            }
        }
    }

}
