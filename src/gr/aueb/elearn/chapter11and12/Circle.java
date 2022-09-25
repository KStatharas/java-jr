package gr.aueb.elearn.chapter11and12;

import gr.aueb.elearn.chapter11and12.chapter11.Point;

public class Circle {

    private gr.aueb.elearn.chapter11and12.chapter11.Point center;
    private int radius;


    public Circle(){};

    public Circle(gr.aueb.elearn.chapter11and12.chapter11.Point center, int radius) {
        this.center = new gr.aueb.elearn.chapter11and12.chapter11.Point(center.getX(), center.getX());
        this.radius = radius;
    }

    public gr.aueb.elearn.chapter11and12.chapter11.Point getCenter() {
        return new gr.aueb.elearn.chapter11and12.chapter11.Point(center.getX(), getCenter().getY());
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void move(int x, int y){
        this.center.move(x,y);
    }

}
