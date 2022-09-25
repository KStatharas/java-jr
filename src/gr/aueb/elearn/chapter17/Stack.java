package gr.aueb.elearn.chapter17;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;

public class Stack<T> {
    private final Deque<T> stack;

    public Stack(){
        stack = new ArrayDeque<>();
    }

    public Stack(Deque<T> stack) {
        this.stack = stack;
    }

    public Deque<T> getStack() {
        return stack;
    }

    public boolean isEmpty(){
        return stack.size() == 0;
    }

    public  void push(T t){
        if (t == null) return;
        stack.push(t);
    }

    public T stackPop(){
        if (!stack.isEmpty()) return stack.pop();
        return null;
    }

    public void forEach(Consumer<T> action){
        stack.forEach(action);
    }
}
