package gr.aueb.elearn.chapter10;

public class PalindromeDemo {

    public static void main(String[] args) {
        String s = "madam";
        boolean is = isPalindrome(s);
        System.out.println(is);
    }

    public static boolean isPalindrome(String str){
        boolean isPal = true;
        for (int i = 0,j = str.length()-1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)){
                isPal = false;
                break;
            }
        }

        return  isPal;
    }
}
