package gr.aueb.elearn.chapter5;


import java.util.Scanner;

public class MethodCalculator {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;

        int choice = 0;
        do {
            menu();
            System.out.println("Dialekse item (0 to exit)");
            choice = in.nextInt();
            if (choice == 0) break;
            System.out.println("Dose 2 arithmous: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();

            switch (choice){
                case 1:
                    result = add(num1,num2);
                    break;
                case 2:
                    result = sub(num1,num2);
                    break;
                case 3:
                    result = mul(num1,num2);
                    break;
                case 4:
                    result = div(num1,num2);
                    break;
                case 5:
                    result = mod(num1,num2);
                    break;
            }

            System.out.println("Result: " + result);

        }while (choice != 6);



    }
    public static void menu () {
        System.out.printf("1. Prosthesi\n2. Afairesi\n3. Multiplication\n4. Diairesi\n5. Ypoloipo\n6. Eksodos\n");
    }
    public static int add (int a, int b){
        return a+b;
    }
    public static int sub (int a, int b){
        return a-b;
    }
    public static int mul (int a, int b){
        return a*b;
    }
    public static int div (int a, int b){
        return (b != 0) ? a/b : 0;
    }
    public static int mod (int a, int b){
        return (b != 0) ? a%b : 0;
    }

}
