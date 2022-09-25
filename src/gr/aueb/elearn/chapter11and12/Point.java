package gr.aueb.elearn.chapter11and12;

public class Point {


    private double x;
    private double y;

    public Point(){};

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public String pointToString(){
        return "("+ x + ")";
    }

    public void move (double x){
        this.x +=x;
    }

    protected  void reset(){
        x = 0;

    }
}
