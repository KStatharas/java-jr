package gr.aueb.elearn.Askiseis.ch14.askisi2;

public class Rectangle extends AbstractShape implements IRectangle {

    private double width;
    private double height;

    Rectangle(){}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public long getCircumference() {
        return 2 * (long)(width + height);
    }
}
