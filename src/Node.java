public class Node<type> {

    private type value;
    private Node<type> next;

    public Node(type val) {
        value = val;
        next = null;
    }
    public type getValue() {
        return value;
    }

    public void setValue(type value) {
        this.value = value;
    }

    public Node<type> getNext() {
        return next;
    }

    public void setNext(Node<type> next) {
        this.next = next;
    }
}
