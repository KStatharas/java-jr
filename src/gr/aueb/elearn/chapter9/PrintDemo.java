package gr.aueb.elearn.chapter9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintDemo {
    public static void main(String[] args) throws FileNotFoundException {
        try (PrintStream ps = new PrintStream("C:\\Users\\Mutantin\\Desktop\\KEDIVIM\\java\\hello.txt");
             PrintWriter pw = new PrintWriter("C:\\Users\\Mutantin\\Desktop\\KEDIVIM\\java\\hello2.txt");) {
            ps.println("Hello");
            pw.println("Hello2");
            pw.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }


    }
}
