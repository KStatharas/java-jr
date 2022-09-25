package gr.aueb.elearn.chapter5;

public class FloatDoubleDemo {

    public static void main(String[] args) {
        float f = 10.5f;
        double d = 2;
        double result;
        double modulo;

        result = f / d;
        modulo = f % d;

        System.out.println("Result: " + result);
        System.out.println("Modulo: " + modulo);
    }
}
