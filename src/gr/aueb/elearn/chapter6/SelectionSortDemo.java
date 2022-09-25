package gr.aueb.elearn.chapter6;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] grades = {20, 19, 15, 43, 54, 80, 27, 48};
        int minPos = 0;

        for (int var:grades) {
            minPos = var;
            for (int var1:grades) {
                if (var1 <= minPos) minPos = var1;
            }
            swap(grades, var, minPos);
        }

        for (int item: grades) {
            System.out.println(item);
        }
    }

    public static void swap (int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
