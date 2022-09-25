package gr.aueb.elearn.Askiseis.ch12.askisi1;

import gr.aueb.elearn.Askiseis.ch12.askisi1.PointXYZ;

public class ProjectPointApp {
    public static void main(String[] args) {
            PointXYZ p1 = new PointXYZ();

            p1.setX(50);
            p1.setY(98);
            p1.setZ(-10);

        System.out.println("p1: " + p1.convertToString()+ "   <=== Values were set manually by calling the setter methods");

        PointXYZ p2 = PointXYZ.probableZero();

        System.out.println("p2: " + p2.convertToString() + "   <=== Values were created randomly by Static Factory Constructor");
    }
}
