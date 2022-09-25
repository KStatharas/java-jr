package gr.aueb.elearn.Askiseis.ch14.askisi1;

public class Line extends AbstractShape {
    private double length;

    Line(){}

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
