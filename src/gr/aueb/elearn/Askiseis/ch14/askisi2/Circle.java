package gr.aueb.elearn.Askiseis.ch14.askisi2;


public class Circle extends AbstractShape implements ICircle {

    private double radius;

    Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI + Math.pow(radius,2);
    }

    @Override
    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public long getCircumference() {
        return (long) (getDiameter() * Math.PI);
    }
}
