package gr.aueb.elearn.chapter14;

public interface IDDefaultDemo {

    default void sayHello(){
        System.out.println("Hello");
    }

    private void sayCoding(){
        System.out.println("Coding");
    }

    static void  sayHi(){
        System.out.println("Hi");
        sayFactory();
    }

    private static void sayFactory(){
        System.out.println("Factory");
    }
}
