package gr.aueb.elearn.chapter6;

public class GetArrayPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int positionToUpdate;

        positionToUpdate = getPosition(arr,0);

        arr[positionToUpdate] = 18;

        for (int item : arr) {
            System.out.println(" " + item);
        }

    }
    public static int getPosition(int[] arr, int num){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
