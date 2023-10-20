import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DoublyLinkedList<E> {

    private class Node<E> {

        private E value;
        private Node<E> next;
        private Node<E> previous;

        public Node(E value) {
            this.value = value;
        }
    }

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size;

    public DoublyLinkedList() {
    }

    public DoublyLinkedList(Node<E> firstNode, Node<E> lastNode) {
        this.firstNode = firstNode;
        this.lastNode = lastNode;
    }

    // O(1)
    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);

        if(isEmpty()) {
            firstNode = lastNode =  newNode;
        } else {
            firstNode.previous = newNode;
            newNode.next = firstNode;
            firstNode = newNode;
        }

        size++;
    }

    // O(1)
    public void addLast(E element) {
        Node<E> newNode = new Node<>(element);

        if(isEmpty()) {
            firstNode = lastNode =  newNode;
        } else {
            newNode.previous = lastNode;
            lastNode.next = newNode;
            lastNode = newNode;
        }

        size++;
    }

    // O(1)
    public void deleteFirst() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }

        if(firstNode == lastNode) {
            firstNode = lastNode = null;
            size = 0;
            return;
        }

        var temp = firstNode;
        firstNode = firstNode.next;
        firstNode.previous = null;
        temp.next = null;

        size--;
    }

    // O(n)
    public void deleteLast() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }

        if(firstNode == lastNode) {
            firstNode = lastNode = null;
            size = 0;
            return;
        }

        var temp = lastNode;
        lastNode = lastNode.previous;
        lastNode.next = null;
        temp.previous = null;

        size--;
    }

    //O(n)
    public void reverse() {
        var current = lastNode;

        while (current != null) {
            var previousNode = current.previous;
            current.previous = current.next;
            current.next = previousNode;
            current = previousNode;
        }

        var temp = firstNode;
        firstNode = lastNode;
        lastNode = temp;
    }

    // O(n)
    public boolean contains(E element) {
        var temp = firstNode;

        // iterating over the list
        while (temp != null) {

            if(temp.value.equals(element)) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    // O(n)
    public int indexOf(E element) {
        var temp = firstNode;
        var index = 0;

        // iterating over the list
        while (temp != null) {

            if(temp.value.equals(element)) {
                return index;
            }

            temp = temp.next;
            index++;
        }

        return -1;
    }

    public int size() {
        return size;
    }

    public List<E> toArray() {
        var temp = firstNode;
        var resultList = new ArrayList<E>();

        // iterating over the list
        while (temp != null) {

            resultList.add(temp.value);

            temp = temp.next;
        }

        return resultList;
    }

    //O(n)
    public E getKthFromTheLast(int Kth) {
        var first = firstNode;
        var second = firstNode;

        int distance = Kth - 1;

        for (int i = 0; i < distance; i++) {
            second = second.next;
        }

        while (second != lastNode) {
            first = first.next;
            second = second.next;
        }

        return first.value;
    }

    private boolean isEmpty() {
        return firstNode == null;
    }
}
