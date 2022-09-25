package gr.aueb.elearn.chapter11and12;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(1);
        Point2D p2 = new Point2D(2,3);
        Point3D p3 = new Point3D(4,5,6);

//        Polymorfismos
//        Point p2 = new Point2D(2,3);
//        Point p3 = new Point3D(4,5,6);


        p1.move(2);
        p2.move(9,12);
        p3.move(5,7,2);

        System.out.println(p1.pointToString());
        System.out.println(p2.pointToString());
        System.out.println(p3.pointToString());

        makeReset(p1);
        makeReset(p2);
        makeReset(p3);
    }

    public static void makeReset (Point point){
        point.reset();
    }

    public  static void printPoint(Point point){
        System.out.println(point.pointToString());
    }
}
