import java.util.ArrayList;
import java.util.Comparator;

public class PriorityQueue<E extends Comparable<E>> {

    private ArrayList<E> queue;

    public PriorityQueue() {
        queue = new ArrayList<>();
    }

    public void enqueue(E element) {
        if(queue.isEmpty()) {
            queue.add(element);
        } else {
            int i;
            for (i = queue.size() - 1; i >= 0 ; i--) {
                var tempVar = queue.get(i);
                if (tempVar.compareTo(element) > 0) {
                    if (i + 1 >= queue.size()) {
                        queue.add(i + 1 , tempVar);
                    } else {
                        queue.set(i + 1 , tempVar);
                    }
                } else  {
                    break;
                }
            }
            if (i + 1 >= queue.size()) {
                queue.add(i + 1 , element);
            } else {
                queue.set(i + 1 , element);
            }
        }
    }

    public E dequeue() {
        if(isEmpty()) {
            throw new IllegalStateException();
        }

        E e = queue.get(0);
        queue.remove(0);

        return e;
    }

    public E peek() {
        if(isEmpty()) {
            throw new IllegalStateException();
        }
        return queue.get(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public String toString() {
        return "queue=" + queue;
    }
}
