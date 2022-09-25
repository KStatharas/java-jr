package gr.aueb.elearn.chapter7;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][4];
        arr1[0][0] = 2;
        arr1[0][1] = 3;
        arr1[1][0] = 5;
        arr1[1][1] = 4;


        int[][] arr2 = {{1,2},{3,4},{5,6}};

        int[][] jagged = new int[3][];
        jagged[0] = new int[10];
        jagged[1] = new int[5];
        jagged[2] = new int[10];

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                System.out.println(" " + arr1[i][j]);
            }
            System.out.println();
        }
        for (int[] row: arr1) {
            for (int j = 0; j < row.length; j++) {
                System.out.println(" " + row[j]);
            }
        }
        for (int[] row2 : arr1) {
            for (int item : row2){
                System.out.println(" " + item);
            }
        }


    }
}
