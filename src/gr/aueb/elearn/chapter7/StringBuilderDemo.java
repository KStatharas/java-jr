package gr.aueb.elearn.chapter7;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        long timeStart, timeEnd;

        double stringConcat = 0.0, stringBuilderConcat = 0.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i<=5000; i++){
            result = result + i;
        }
        timeEnd = System.currentTimeMillis();
        stringConcat = (double) (timeEnd - timeStart) / 1000;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i<=5000; i++){
            sb.append(i);
        }
        timeEnd = System.currentTimeMillis();
        stringConcat = (double) (timeEnd - timeStart) / 1000;

        System.out.println("Time comparison String vs StringBuilder");
        System.out.printf("String %f sec vs StringBuilder: %f sec \n", stringConcat,stringBuilderConcat);
    }
}
