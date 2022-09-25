package gr.aueb.elearn.chapter10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Lotto4Demo {
    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("C:\\Users\\Mutantin\\Desktop\\KEDIVIM\\java\\lotto4demo\\lotto-in.txt");
        File outFile = new File("C:\\Users\\Mutantin\\Desktop\\KEDIVIM\\java\\lotto4demo\\lotto-out.txt");

        Scanner in = new Scanner(inFile);
        PrintStream ps = new PrintStream(outFile);

        final int N = 4;
        int[] row = new int[4];

        ArrayList<Integer> inputNumbers = new ArrayList<>();

        while (in.hasNextInt()){
            inputNumbers.add(in.nextInt());
        }

        for (int i = 0; i <= inputNumbers.size() - N; i++) {
            for (int j = i+1; j <= inputNumbers.size() - N + 1; j++) {
                for (int k= j+1; k <= inputNumbers.size() - N + 2; k++){
                    for (int l = k + 1; l < inputNumbers.size(); l++){
                        row[0] = inputNumbers.get(i);
                        row[1] = inputNumbers.get(j);
                        row[2] = inputNumbers.get(k);
                        row[3] = inputNumbers.get(l);

                        if ((!isEven(row)) && (!isOdd(row))){
                            ps.printf("%d\t%d\t%d\t%d\n",row[0],row[1],row[2],row[3]);
                        }
                    }

                }
            }
        }

    }

    public static boolean isEven(int[] arr){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) count ++;
        }

        return (count == 4);
    }

    public static boolean isOdd(int[] arr){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) count ++;
        }

        return (count == 4);
    }

}

