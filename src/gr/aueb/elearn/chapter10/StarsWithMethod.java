package gr.aueb.elearn.chapter10;

public class StarsWithMethod {
    public static void main(String[] args) {

    }

    public static void printStars (int n) {
        System.out.println("*".repeat(n));
    }

    public static void printStarsHV(int n, int s){
        for (int i = 0; i <= n; i++) {
            printStars(n);
            System.out.println();
        }
    }
}
