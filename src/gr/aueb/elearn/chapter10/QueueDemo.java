package gr.aueb.elearn.chapter10;

import java.util.Arrays;

public class QueueDemo {
    static  int[] queue = new int[10];
    static  int top = -1;

    public static void main(String[] args) {
        enQueue(1);
        enQueue(1);
        enQueue(1);
        enQueue(1);
        enQueue(1);
        Integer num = deQueue();
        num = deQueue();
        enQueue(11);

        printQueue();

        System.out.println();
        System.out.println(num);

    }
    public static void enQueue (int num){
        if (!isFull()){
            queue[++top] = num;
        }
    }

    public static Integer deQueue(){
        Integer num;
        if (!isEmpty()){
            num = queue[0];
            top --;
            queue = Arrays.copyOfRange(queue, 1, queue.length + 1);
            return num;
        }
            return null;
    }
    public static boolean isFull(){
        return (top == queue.length -1);
    }

    public static boolean isEmpty(){
        return top == -1;
    }

    public static void printQueue(){
        for (int i = 0; i <= top ; i++) {
            System.out.println(queue[i]);
        }
    }
}
