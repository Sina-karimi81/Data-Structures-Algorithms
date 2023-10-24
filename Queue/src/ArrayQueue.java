import java.util.Arrays;

public class ArrayQueue<E> {

    private Object[] queue;

    private int front = 0;
    private int rear = 0;
    private int count = 0;

    public ArrayQueue(int initialSize) {
        queue = new Object[initialSize];
    }

    public void enqueue(E element) {
        if(count == queue.length) {
            throw new IllegalStateException();
        }

        queue[rear] = element;
        // to make the array circular
        rear = (rear + 1) % queue.length;
        count++;
    }

    public E dequeue() {
        if(count == 0) {
            throw new IllegalStateException();
        }

        var res = queue[front];
        queue[front] = 0;
        front++;
        front = (front + 1) % queue.length;
        count--;
        return (E) res;
    }

    public E peek() {
        if(count == 0) {
            throw new IllegalStateException();
        }

        var res = queue[front];
        return (E) res;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == queue.length;
    }

    @Override
    public String toString() {
        return "ArrayQueue = " + Arrays.toString(queue);
    }
}
