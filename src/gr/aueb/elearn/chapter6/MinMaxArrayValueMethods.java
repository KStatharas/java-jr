package gr.aueb.elearn.chapter6;

public class MinMaxArrayValueMethods {
    public static void main(String[] args) {
        int[] ages = {20, 19, 15, 43, 54, 80, 27, 48};
    }

    public static int getMinValue(int[] arr) {
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }
    public static int getMaxValue(int[] arr){
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}

