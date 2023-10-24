import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        var queue = new ArrayDeque<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("queue = " + queue);
        reverseQueue(queue);
        System.out.println("queue = " + queue);

        System.out.println("----------------------------------------------------------------");

        var arrayQueue = new ArrayQueue<Integer>(5);
        System.out.println("arrayQueue.isEmpty() = " + arrayQueue.isEmpty());
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        arrayQueue.enqueue(40);
        arrayQueue.enqueue(50);
        System.out.println("arrayQueue = " + arrayQueue);
        System.out.println("arrayQueue.isEmpty() = " + arrayQueue.isEmpty());
        System.out.println("arrayQueue.isFull() = " + arrayQueue.isFull());
        Integer dequeue = arrayQueue.dequeue();
        System.out.println("dequeue = " + dequeue);
        System.out.println("arrayQueue = " + arrayQueue);
        System.out.println("arrayQueue.isEmpty() = " + arrayQueue.isEmpty());
        System.out.println("arrayQueue.isFull() = " + arrayQueue.isFull());
        arrayQueue.enqueue(60);
        System.out.println("arrayQueue = " + arrayQueue);

        System.out.println("----------------------------------------------------------------");

        var stackQueue = new StackQueue<Integer>();
        System.out.println("stackQueue.isEmpty() = " + stackQueue.isEmpty());
        stackQueue.enqueue(10);
        stackQueue.enqueue(20);
        stackQueue.enqueue(30);
        stackQueue.enqueue(40);
        stackQueue.enqueue(50);
        System.out.println("stackQueue = " + stackQueue);
        System.out.println("stackQueue.isEmpty() = " + stackQueue.isEmpty());
        Integer popedData = stackQueue.dequeue();
        System.out.println("popedData = " + popedData);
        System.out.println("stackQueue = " + stackQueue);
        System.out.println("stackQueue.isEmpty() = " + stackQueue.isEmpty());
        stackQueue.enqueue(60);
        while (!stackQueue.isEmpty()) {
            System.out.println("stackQueue.dequeue() = " + stackQueue.dequeue());
        }

        System.out.println("----------------------------------------------------------------");

        var priorityQueue = new PriorityQueue<Integer>();
        System.out.println("priorityQueue.isEmpty() = " + priorityQueue.isEmpty());
        priorityQueue.enqueue(5);
        priorityQueue.enqueue(3);
        priorityQueue.enqueue(1);
        priorityQueue.enqueue(7);
        System.out.println("priorityQueue.isEmpty() = " + priorityQueue.isEmpty());
        System.out.println("priorityQueue = " + priorityQueue);
        System.out.println("priorityQueue.dequeue() = " + priorityQueue.dequeue());
        System.out.println("priorityQueue = " + priorityQueue);
        System.out.println("priorityQueue.peek() = " + priorityQueue.peek());
        System.out.println("priorityQueue = " + priorityQueue);


    }

    public static void reverseQueue(Queue<Integer> queue) {
        var stack = new Stack<Integer>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

}
