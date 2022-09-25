package gr.aueb.elearn.chapter7;

public class StringFormat {
    public static void main(String[] args) {
        char c = 'A';
        int num = 5;

        String s = String.format("%c%02d",c,num);
        System.out.println(s);
    }
}
