package gr.aueb.elearn.Askiseis.ch12.askisi1;

import java.util.Random;

public class PointXYZ {
    private double x;
    private double y;
    private double z;

    PointXYZ(){}

    public PointXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static PointXYZ probableZero(){
        Random r = new Random();
        return new PointXYZ(r.nextInt(200)-100,r.nextInt(200)-100,0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String convertToString() {return "("+getX()+","+getY()+","+getZ()+")";}
}
