package gr.aueb.elearn.chapter3;

import java.util.Scanner;

public class NestedIfGradeDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int moduleCount = 0;
        int totalMarks = 0;
        int average = 0;
        System.out.println(("Doste plithos mathimatwn k synolo bathmologias"));
        moduleCount = in.nextInt();
        totalMarks = in.nextInt();

        if (moduleCount!=0) {
            average = totalMarks / moduleCount;

            if (average >= 5) {
                if (average <= 6) {
                    System.out.println("Kalws: " + average);
                }
                else if (average <= 8){
                        System.out.println("Lian kalws: "        + average);
                }
                else{
                        System.out.println("Aristo: " + average);
                }
            }

            else {
                System.out.println("Apotyxia");
            }
        }
    }
}
