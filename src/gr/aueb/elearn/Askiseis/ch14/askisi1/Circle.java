package gr.aueb.elearn.Askiseis.ch14.askisi1;

public class Circle extends AbstractShape implements TwoDimensional{

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

}
