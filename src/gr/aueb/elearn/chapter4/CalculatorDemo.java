package gr.aueb.elearn.chapter4;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int num1,num2,result = 0;
        char ch;

        System.out.println("Parakalw doste enter meta apo kathe sybolo i arithmo");

        num1 = in.nextInt();
        ch = (char)System.in.read();
        num2 = in.nextInt();

        switch (ch){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0){
                    System.out.println("division by 0");
                    break;
                }
                else{
                    result = num1 / num2;
                }
                break;
            case '%':
                if (num2 == 0){
                    System.out.println("division by 0");
                }
                else{
                    result = num1 % num2;
                }
                break;
            default:
                result = 0;
                break;

        }
        System.out.println("Apotelesma: " + result);
    }
}
