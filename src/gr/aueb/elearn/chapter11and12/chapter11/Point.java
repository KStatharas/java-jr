package gr.aueb.elearn.chapter11and12.chapter11;

import java.util.Random;

public class Point {
    private int x;
    private int y;

    public Point(){};

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static  Point getZeroPont(){
        return new Point();
    }

    public static Point getRandomPoint(){
        Random r = new Random();
        return new Point(r.nextInt(),r.nextInt());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move5(){
        y+=5;
        x+=5;
    }




    //UTILITY METHOD
    //PUBLIC API
    public String pointToString(){
        return "(" + x + "," + y + ")";
    }




    //PUBLIC API
    /**
     * Moves the point to a new position
     *
     * added by x,y
     * @param x  The x-coordinate to add
     * @param y  The y-coordinate to add
     * **/
    public void move(int x, int y){
        this.y+=y;
        this.x+=x;
    }
}
