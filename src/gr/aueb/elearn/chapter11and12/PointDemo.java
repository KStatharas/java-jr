package gr.aueb.elearn.chapter11and12;

import gr.aueb.elearn.chapter11and12.chapter11.Point;

public class PointDemo {
    public static void main(String[] args) {
        gr.aueb.elearn.chapter11and12.chapter11.Point p1 = new Point(2,1);
        p1.move(7,3);

        System.out.println(p1.pointToString());
    }
}
