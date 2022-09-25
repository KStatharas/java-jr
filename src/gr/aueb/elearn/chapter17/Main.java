package gr.aueb.elearn.chapter17;

public class Main {
//    public static void main(String[] args) {
////        Node head = new Node();
////        head.setItem("Hello");
////        int data = (int) head.getItem();
////        System.out.println(data);
//
//        GenericNode<Integer> intNode = new GenericNode<>();
//        var IntNode2 = new GenericNode<>();
//
//        Integer[] intArr = {1,2,3};
//        String[] strArr = {"hey1","hey2"};
//
//        printArray(intArr);
//        printArray(strArr);
//    }
//
//    public static <T> void  printArray(T[] arr){
//        for (T arrayItem : arr
//             ) {
//            System.out.println(arrayItem);
//        }
//    }
//
//    public static void  priint(GenericNode<?> node){
//        System.out.println(node.getItem());
//    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        int num = myStack.stackPop();
        System.out.println(num);

        myStack.forEach(System.out::println);
    }
}
