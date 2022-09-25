package gr.aueb.elearn.chapter8;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
