package gr.aueb.elearn.chapter7;

public class GenercStringMethods {
    public static void main(String[] args) {
        String s = String.valueOf(1); //int -> string
        int num = Integer.parseInt("2"); //string -> int
        String s1 = "Aueb";
        String s2 = s1.toLowerCase();
        String s3 = s1.toUpperCase();
        String s4 = "     AUEB    ".trim();
        System.out.println(s4);
        System.out.println("*".repeat(10));

        if (s4.isEmpty()) System.out.println("is empty");
    }
}
