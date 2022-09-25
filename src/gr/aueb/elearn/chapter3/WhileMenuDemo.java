package gr.aueb.elearn.chapter3;

import java.util.Scanner;

public class WhileMenuDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Dialekse enan apo tous parakatw arithmous (0 to exit): \n1)\n2)\n3)\n");
        int number = input.nextInt();
        while (number==1 || number==2 || number==3){
            number = input.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Epelekses to 1.");
                    System.out.printf("Dialekse enan apo tous parakatw arithmous (0 to exit): \n1)\n2)\n3)\n");
                    break;
                case 2:
                    System.out.println("Epelekses to 2");
                    System.out.printf("Dialekse enan apo tous parakatw arithmous (0 to exit): \n1)\n2)\n3)\n");
                    break;
                case 3:
                    System.out.println("Epelekses to 3");
                    System.out.printf("Dialekse enan apo tous parakatw arithmous (0 to exit): \n1)\n2)\n3)\n");
                    break;
                default:
                    System.out.println("Now exiting");
                    break;
            }

        }
    }
}
