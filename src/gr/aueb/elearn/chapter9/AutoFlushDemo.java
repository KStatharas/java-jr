package gr.aueb.elearn.chapter9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class AutoFlushDemo {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\Mutantin\\Desktop\\KEDIVIM\\java\\file.txt", true));
        PrintWriter pw = new PrintWriter(new FileOutputStream("C:\\Users\\Mutantin\\Desktop\\KEDIVIM\\java\\file2.txt", true));

       printMessage(ps,"Hello");
       printMessage(pw,"Hello2");

    }

    public static void printMessage(PrintStream ps, String message){
        if (ps!=null){
            ps.println(message);
            ps.flush();
        }
    }

    public static void printMessage(PrintWriter pw, String message){
        if (pw!=null){
            pw.println(message);
            pw.flush();
        }
    }
}
