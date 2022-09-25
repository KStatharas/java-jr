package gr.aueb.elearn.chapter10;

public class ShallowDeepCopyDemo {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = makeShallow(arr1);
        int[] arr3 = makeDeep(arr1);

        arr3[0] = 100;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
    public static int[] makeShallow(int[] arr){
        return arr;
    }

    public static int[] makeDeep(int[] arr){
        int[] copied = new int[arr.length];
        System.arraycopy(arr,0,copied,0,arr.length);
        return copied;
    }
}
