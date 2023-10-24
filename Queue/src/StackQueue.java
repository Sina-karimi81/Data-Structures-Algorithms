import java.util.Stack;

public class StackQueue<E> {

    Stack<E> holder;
    Stack<E> queue;

    public StackQueue() {
        holder = new Stack<>();
        queue = new Stack<>();
    }

    public void enqueue(E element) {
        holder.push(element);
    }

    public E dequeue() {
        if(isEmpty()) {
            throw new IllegalStateException();
        }

        dataTransitionFromHolderToQueue();
        return queue.pop();
    }

    public E peek() {
        if(isEmpty()) {
            throw new IllegalStateException();
        }

        dataTransitionFromHolderToQueue();
        return queue.peek();
    }

    public boolean isEmpty() {
        return holder.isEmpty() && queue.isEmpty();
    }

    private void dataTransitionFromHolderToQueue() {
        if (queue.isEmpty()) {
            while (!holder.isEmpty()) {
                queue.push(holder.pop());
            }
        }
    }

    @Override
    public String toString() {
        return "queue=" + queue;
    }
}
