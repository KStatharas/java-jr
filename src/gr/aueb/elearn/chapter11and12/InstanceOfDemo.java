package gr.aueb.elearn.chapter11and12;

public class InstanceOfDemo {
    private static final Point[] points;

    //Static Initializer

    static {
        points = new Point[] {new Point(1),new Point2D(2,3),new Point3D(5,6,7)};
    }

    public static void main(String[] args) {
        for (Point point : points){
            if (point instanceof Point){
                System.out.println("Point: " + point.getClass().getSimpleName());
            }
            if (point instanceof Point2D){
                System.out.println("Point2d: " + point.getClass().getSimpleName());
            }

            if (point instanceof Point2D){
                System.out.println("Point3d: " + point.getClass().getSimpleName());
            }

        }

    }
}
