package gr.aueb.elearn.chapter2;

import java.util.Locale;

public class OverflowTypeCastDemo {
    public static void main(String[] args) {
        long num = 2_147_483_648L;
        int i = 20;
        long myLong = 40;

        i = (int) myLong;

        long result = myLong + 3;
        System.out.println(result);
        System.out.println("to apotelesma einai: " + result);
        System.out.printf(Locale.US,"to apotelesma einai: %2d\n",result);
        System.out.printf("To apotelesma einai: %d",num);

    }
}
