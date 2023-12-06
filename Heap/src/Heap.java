import java.util.ArrayList;

public class Heap {

    private int[] heap = new int[10];
    private int size;

    public int getMax() {
        return heap[0];
    }

    public void insert(int value) {
        if (isFUll()) {
            throw new IllegalStateException();
        }

        heap[size++] = value;

        bubbleUp();
    }

    public int delete() {
        if (size == 0) {
            throw new IllegalStateException();
        }

        var root = heap[0];

        var lastVal = heap[size - 1];
        heap[0] = lastVal;
        size--;

        bubbleDown();

        return root;
    }

    private boolean isFUll() {
        return size == heap.length;
    }

    private void swap(int first , int second) {
        var temp = heap[first];
        heap[first] = heap[second];
        heap[second] = temp;
    }

    private int parentIndex(int index) {
        return (index - 1) / 2;
    }

    private int rightChildIndex(int index) {
        return (index * 2) + 1;
    }

    private int leftChildIndex(int index) {
        return (index * 2) + 2;
    }

    private boolean hasLeftChild(int index) {
        return leftChildIndex(index) <= size;
    }

    private boolean hasRightChild(int index) {
        return rightChildIndex(index) <= size;
    }

    private boolean isValidParent(int index) {
        if (!hasLeftChild(index)) {
            return true;
        }

        if (!hasRightChild(index)) {
            return heap[index] > heap[leftChildIndex(index)];
        }

        return heap[index] >= heap[leftChildIndex(index)] &&
                heap[index] >= heap[rightChildIndex(index)];
    }

    private void bubbleUp() {
        var index = size - 1;

        while (size > 0 && heap[index] > heap[parentIndex(index)]) {
            swap(index , parentIndex(index));
            index = parentIndex(index);
        }
    }

    private void bubbleDown() {
        var index = 0;

        while (index <= size && !isValidParent(index)) {
            var largerChildIndex = largerChildIndex(index);

            swap(index , largerChildIndex);
            index = largerChildIndex;
        }
    }

    private int largerChildIndex(int index) {
        if (!hasLeftChild(index)) {
            return index;
        }

        if (!hasRightChild(index)) {
            return leftChildIndex(index);
        }

        return (heap[leftChildIndex(index)] > heap[rightChildIndex(index)]) ? leftChildIndex(index) : rightChildIndex(index);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "heap =" + heap;
    }
}
