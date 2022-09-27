package gr.aueb.elearn.chapter17.doublyLinkedList;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    private DoublyLinkedList(){
        head = tail = null;
    }

    public void insertFront (T t){
        Node<T> nodeToBeInserted = new Node<>();
        nodeToBeInserted.setValue(t);
        nodeToBeInserted.setPrev(null);
        nodeToBeInserted.setNext(head);
//      if (head != null){
        if (!isEmpty())
            nodeToBeInserted.getNext().setPrev(nodeToBeInserted);
        else
            tail = nodeToBeInserted;

        head = nodeToBeInserted;
    }

    public void insertEnd (T t){
        Node<T> tmp = new Node<>();
        tmp.setValue(t);
        tmp.setPrev(head);
        tmp.setNext(tail);
        tail = tmp;
//        if (tmp.getPrev() == null){
        if (isEmpty())
            head = tmp;
        else
            tmp.getPrev().setNext(tmp);

    }

    public void deleteFront(){
        if (isEmpty()) return;
        if(head.getNext()==null){
            head = tail = null;
        }
        else {
            head = head.getNext();
            head.setPrev(null);
        }
    }

    public void deleteEnd(){
        if (isEmpty()) return;
        if (head.getNext() == null){
            head = tail = null;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
    }

    public Node<T> get(T t){
        for (Node<T> n = head; n != null; n = n.getNext()){
            if (n.getValue().equals(t)){
                return n;
            }
        }

        return null;
    }

    public void traverse(){
        for (Node<T> n = head; n != null; n = n.getNext())
            System.out.println(n);
    }

    public boolean isEmpty(){
        return (head == null) && (tail == null);
    }
}
