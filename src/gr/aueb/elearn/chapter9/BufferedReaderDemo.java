package gr.aueb.elearn.chapter9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        String line;
        String[] cities;

        try (var br = new BufferedReader(new FileReader("C:\\Users\\Mutantin\\Desktop\\KEDIVIM\\java\\cities-in.txt"));
             var ps = new PrintStream("C:\\Users\\Mutantin\\Desktop\\KEDIVIM\\java\\cities-out.txt")){

            while ((line = br.readLine())!= null){
                cities = line.split(" +");
                printCities(ps,cities);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printCities (PrintStream ps, String[] cities){
        for (String city : cities){
            ps.print(" " + city);
        }
        ps.println();
    }
}
