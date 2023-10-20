import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------Singly linked--------------------------");
        var linkedList = new LinkedList<Integer>();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addFirst(50);

        System.out.println(linkedList.size());

        System.out.println(linkedList.indexOf(20));

        System.out.println(linkedList.indexOf(100));
        System.out.println(linkedList.contains(100));

        linkedList.deleteFirst();

        System.out.println(linkedList.size());

        linkedList.deleteLast();

        System.out.println(linkedList.size());

        List<Integer> integers = linkedList.toArray();
        System.out.println(Arrays.toString(integers.toArray()));

        linkedList.addFirst(50);
        linkedList.addLast(30);
        linkedList.reverse();
        System.out.println(Arrays.toString(linkedList.toArray().toArray()));

        System.out.println(linkedList.getKthFromTheLast(2));

        System.out.println("----------------------doubly linked--------------------------");

        var doublyLinkedList = new DoublyLinkedList<Integer>();
        doublyLinkedList.addLast(10);
        doublyLinkedList.addLast(20);
        doublyLinkedList.addLast(30);
        doublyLinkedList.addFirst(50);

        System.out.println(doublyLinkedList.size());

        System.out.println(doublyLinkedList.indexOf(20));

        System.out.println(doublyLinkedList.indexOf(100));
        System.out.println(doublyLinkedList.contains(100));

        doublyLinkedList.deleteFirst();

        System.out.println(doublyLinkedList.size());

        doublyLinkedList.deleteLast();

        System.out.println(doublyLinkedList.size());

        List<Integer> integersList = doublyLinkedList.toArray();
        System.out.println(Arrays.toString(integersList.toArray()));

        doublyLinkedList.addFirst(50);
        doublyLinkedList.addLast(30);
        doublyLinkedList.reverse();
        System.out.println(Arrays.toString(linkedList.toArray().toArray()));

        System.out.println(doublyLinkedList.getKthFromTheLast(2));
    }

}
