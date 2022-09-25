package gr.aueb.elearn.chapter10;

public class StackDemo {
    static int[] stack = new int[10];
    static int top = -1;

    public static void main(String[] args) {
        Integer num;
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        num = pop();

        printStack();

        System.out.println();
        System.out.println("Pop out element:" + num);
    }
    public static void push(int sum){
        if (!isFull()){
            top++;
            stack[top] = sum;
        }
        else {
            System.out.println("Stack is full");
        }
    }

    public static Integer pop(){
        return  (!isEmpty()) ? stack[top++] : null;
    }

    public static boolean isFull(){
        return (top == stack.length -1);
    }

    public static boolean isEmpty(){
        return (top ==-1);
    }

    public static void printStack(){
        for (int i = 0; i <= top ; i++) {
            System.out.println(stack[i]);
        }
    }
}
