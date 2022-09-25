package gr.aueb.elearn.chapter9;

import java.io.*;

public class FileAppendDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\Mutantin\\Desktop\\KEDIVIM\\java\\append.txt", true));
        PrintStream ps2 = new PrintStream(new FileOutputStream("C:\\Users\\Mutantin\\Desktop\\KEDIVIM\\java\\append2.txt", true),true,"UTF-8");
        ps.println("Hello");
    }
}
