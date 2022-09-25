package gr.aueb.elearn.chapter7;

public class SplitStringDemo {
    public static void main(String[] args) {
        String aueb = "Athens Unversity of Economics and Business";

        String[] tokens = aueb.split(" +");

        for (String token : tokens){
            System.out.println(token);
        }
    }
}
