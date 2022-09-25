package gr.aueb.elearn.chapter4;
import java.io.IOException;
//diabazei ti pataw sto keyboard ews  otou na patisw "!".

public class CharReadDemo {
    public static void main(String[] args) throws IOException {
        char ch;

        do {
            System.out.println("Dose enan character: ");
            ch = (char) System.in.read();
            System.in.skip(2);
            System.out.println(ch);
        }while (ch != '!');
    }
}
