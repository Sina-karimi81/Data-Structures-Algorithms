public class PriorityQueueWithHeap {

    private Heap heap = new Heap();

    // O(logn)
    public void enqueue(int value) {
        heap.insert(value);
    }

    // O(logn)
    public int dequeue() {
        return heap.delete();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

}
