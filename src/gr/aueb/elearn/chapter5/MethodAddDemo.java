package gr.aueb.elearn.chapter5;

public class MethodAddDemo {
    public static void main(String[] args) {
        int sum = add(3,5);
        System.out.println("Sum: " + sum);
    }

    public static int add(int a, int b){
        return a + b;
    }
}
