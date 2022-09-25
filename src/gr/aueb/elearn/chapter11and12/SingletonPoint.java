package gr.aueb.elearn.chapter11and12;

public class SingletonPoint {

    private int x;
    private int y;

    private static final SingletonPoint SP = new SingletonPoint();

    private SingletonPoint(){}

    private static SingletonPoint getInstance(){
        return SP;
    }
}
