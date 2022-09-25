package gr.aueb.elearn.chapter3;

public class BreakAndContinueDemo {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int result = 0;

        while (true) {
            System.out.println((i + " "));
            if (i == 10) break;
            i++;
        }
        while (j <= 10) {
            j++;
            if (j == 5) continue;
            result += j;
        }
    }
}
