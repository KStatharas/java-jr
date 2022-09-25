package gr.aueb.elearn.chapter10;

public class Grid15Demo {

    public static void main(String[] args) {
        int[][] arr = {
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}
        };

        if (isArr15(arr)){
            System.out.println("Sum is 15");
        }
        else {
            System.out.println("Sum is not 15");
        }
    }

    public static boolean isArr15(int[][] arr){
        if (arr == null) return false;

        boolean d1 = false;
        boolean d2 = false;

        int[] vSum = {0,0,0};
        int hSum;
        int hCount = 0;
        int vCount = 0;

        if(arr[0][0] + arr[1][1] + arr[2][2] == 15) d1 = true;
        if(arr[0][2] + arr[1][1] + arr[2][0] == 15) d2 = true;

        for(int[] row : arr){
            vSum[0] += row[0];
            vSum[1] += row[1];
            vSum[2] += row[2];


            hSum = 0;
            for (int item : row){
                hSum += item;
            }
            if (hSum == 15) hCount++;
        }

        for(int sum : vSum){
            if(sum == 15){
                vCount++;
            }
        }

        return d1 && d2 && (vCount == 3) && (hCount == 3);
    }
}
