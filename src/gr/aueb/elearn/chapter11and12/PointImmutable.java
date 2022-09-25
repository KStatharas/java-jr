package gr.aueb.elearn.chapter11and12;

public class PointImmutable {

    private final int x;
    private final int y;

    public PointImmutable(){
        x = 0;
        y = 0;
    }

    public PointImmutable(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
