package gr.aueb.elearn.chapter5;

public class SwapDemo {
    public static void main(String[] args) {
        int sum = add(2,3);
        long res = add(2, 3, 5);
        long sum2 = add(2,5L);
        long sum3 = add(5L, 8L);
    }
    public static int add (int a, int b){
        return a + b;
    }
    public static long add (long a, long b){
        return a + b;
    }
    public static int add (int a, int b , int c){
        return a + b + c;
    }
    public static long add (int a, long b){
        return a + b;
    }
}
