package gr.aueb.elearn.chapter7;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "AUEB";

        boolean areEqual = s1.equalsIgnoreCase(s2);

        if (s1.compareTo(s2) == 0){
            System.out.println("EQUAL");
        } else if (s1.compareTo(s2)<0) {

        }
        else {
            System.out.println("s1 > s2");
        }
    }
}
