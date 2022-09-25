package gr.aueb.elearn.chapter6;

public class MinMaxArrayValue {
    public static void main(String[] args) {


        int[] ages = {20, 19, 15, 43, 54, 80, 27, 48};

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < minValue) {
                minValue = ages[i];
            }
            if (ages[i] > maxValue) {
                maxValue = ages[i];
            }
        }
    }
}
