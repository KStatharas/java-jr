package gr.aueb.elearn.chapter14.ishapes;

public class Circle extends AbstractShape implements IShape,ITwoDimensional{
    private Point point;
    private double radius;

    public Circle (){}

    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    public Point getPoint() {
        return new Point(this.point);
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI + radius * radius;
    }
}
