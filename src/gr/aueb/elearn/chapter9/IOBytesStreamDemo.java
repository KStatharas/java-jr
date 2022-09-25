package gr.aueb.elearn.chapter9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOBytesStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fs = new FileInputStream("C:\\Users\\Mutantin\\Desktop\\KEDIVIM\\java\\aueb.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Mutantin\\Desktop\\KEDIVIM\\java\\auebBack.jpg");
        int b, count = 0;
        byte[] buf = new byte[8192];

        long timeStart = 0, timeEnd = 0;
        double elapsesTime = 0.0;

        timeStart = System.currentTimeMillis();

        while ((b = fs.read())!= -1){
            fos.write(buf,0,b);
            count +=b;
        }
        timeEnd = System.currentTimeMillis();
        elapsesTime = (timeEnd - timeStart) / 10000;
        System.out.println("File size = %,.2f KBytes\n"+ Math.ceil((double) count/1024));
        System.out.println("Elapsed Time: " + elapsesTime + " secs");
    }
}
