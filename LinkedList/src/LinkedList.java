import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedList<E> {

    private class Node<E> {

        private E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
        }
    }

    private Node<E> firstNode;
    private Node<E> lastNode;

    private int size;

    public LinkedList() {
    }

    public LinkedList(Node<E> firstNode, Node<E> lastNode) {
        this.firstNode = firstNode;
        this.lastNode = lastNode;
    }

    // O(1)
    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);

        if(isEmpty()) {
            firstNode = lastNode =  newNode;
        } else {
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

        var beforeLast = getPreviousNode(lastNode);

        if (beforeLast != null) {
            lastNode = beforeLast;
            lastNode.next = null;
            size--;
        }
    }

    // O(n)
    public void reverse() {
        var previous = firstNode;
        var current = firstNode.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        lastNode = firstNode;
        lastNode.next = null;
        firstNode = previous;
    }

    private Node<E> getPreviousNode(Node<E> node) {
        var current = firstNode;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }

        return null;
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
