package gr.aueb.elearn.chapter6;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {20, 19, 15, 43, 54, 80, 27, 48};

        for (int i = 0; i < arr.length - 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, i, j + 1);
                }
            }
        }
        for (int item : arr) {
            System.out.println(item);
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
