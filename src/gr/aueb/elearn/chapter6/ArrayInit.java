package gr.aueb.elearn.chapter6;

public class ArrayInit {
    public static void main(String[] args) {
        int[] arr = new int[3];

        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 8;

        for (int i = 0; i < arr.length; i++){
            System.out.println(" " + arr[i]);
        }

        for (int item : arr){
            System.out.println(" " + item);
        }
    }
}
