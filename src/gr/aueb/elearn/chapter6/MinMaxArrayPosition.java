package gr.aueb.elearn.chapter6;

public class MinMaxArrayPosition {
    public static void main(String[] args) {
        int[] grades = {20, 19, 15, 43, 54, 80, 27, 48};
        int minPosition = 0;
        int maxPosition = 0;


        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < grades[minPosition]){
                minPosition = i;
            }
        }

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > grades[maxPosition]){
                maxPosition = i;
            }
        }
        System.out.printf("MinPosition: %d, MinValue: %d", (minPosition + 1), grades[minPosition]);
        System.out.println();
        System.out.printf("MinPosition: %d, MinValue: %d", (maxPosition + 1), grades[maxPosition]);
    }
}
