package gr.aueb.elearn.chapter6;

public class MinMaxArrayPostionMethods {
    public static void main(String[] args) {
        int[] grades = {20, 19, 15, 43, 54, 80, 27, 48};

    }

    public static int getMinPosition(int[] arr){
        int minPosition = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minPosition]){
                minPosition = i;
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int[] arr){
        int maxPosition = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxPosition]){
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}
