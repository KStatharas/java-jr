package gr.aueb.elearn.chapter8;

import java.io.IOException;

public class CharReadExceptionDemo {
    public static void main(String[] args) {
        try {
            char ch = getChar();
        } catch (IOException e) {
            System.out.println("Lathos i/o");
        }

    }

    public static char getChar() throws IOException{
        char ch;

        try {
            ch = (char)System.in.read();
            return ch;

        } catch (IOException e) {
            System.err.println();
            throw e;
        }

    }
}
