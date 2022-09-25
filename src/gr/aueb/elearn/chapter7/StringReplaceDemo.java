package gr.aueb.elearn.chapter7;

public class StringReplaceDemo {
    public static void main(String[] args) {
        String s = "Athens Unversity of Economics and Business";
        s = s.replace("-","");
        s = s.replace("E","e");
        System.out.println(s);
    }
}
