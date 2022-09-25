package gr.aueb.elearn.chapter4;

public class ForSumMulDemo {
    public static void main(String[] args) {
        int sum = 0;
        int result = 1;

        for (int i = 1; i<=10; i++) {
            sum += i;
            result += i;
        }
        System.out.println("Sum: " + sum + " ,Mul: " + result);
    }
}
