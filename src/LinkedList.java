public class LinkedList<type> implements List<type> {

    private Node<type> head;

    ///Adds an element to the end of the list.
    @Override
    public void add(type value) {
        Node<type> node = new Node<type>(value);

        if (head == null) {
            head = node;
        } else {
            Node<type> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    ///Inserts an element at the specified index.
    @Override
    public void insert(int index, type value) {
        Node<type> node = new Node<type>(value);

        if (index == 0) {
            node.setNext(head);
            head = node;
        } else {
            Node<type> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            node.setNext(current.getNext());
            current.setNext(node);
        }
    }

    ///Removes all elements from the list.
    @Override
    public void clear() {
        head = null;
    }

    ///Returns the element at the specified index.
    @Override
    public type get(int index) {
        Node<type> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    ///Returns the index of the first occurrence of the specified element in the list, or -1 if the list does not contain the element.
    @Override
    public int indexOf(type value) {
        Node<type> current = head;
        int index = 0;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    ///Removes the element at the specified index.
    @Override
    public void remove(int index) {
        Node<type> current = head;
        Node<type> before = null;
        for (int i = 0; i < index; i++) {
            before = current;
            current = current.getNext();
        }

        before.setNext(current.getNext());
    }

    ///Returns the number of elements in the list.
    @Override
    public int size() {
        Node<type> current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }
}
