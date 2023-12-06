public class MaxHeap {
    public static void heapify(int[] array) {
        var lastParentIndex = array.length / 2 - 1;

        for (int i = lastParentIndex; i >= 0; i--) {
            heapify(array , i);
        }
    }

    public static int kthLargestNumber(int[] array , int kth) {
        var heap = new Heap();

        for (int num: array) {
            heap.insert(num);
        }
        for (int i = 0; i < kth - 1; i++) {
            heap.delete();
        }

        return heap.getMax();
    }

    private static void heapify(int[] array , int index) {
        var largestIndex = index;

        var leftIndex = 2 * index + 1;
        if(leftIndex < array.length && array[leftIndex] > array[largestIndex]) {
            largestIndex = leftIndex;
        }

        var rightIndex = 2 * index + 2;
        if(rightIndex < array.length && array[rightIndex] > array[largestIndex]) {
            largestIndex = rightIndex;
        }

        if (index == largestIndex) {
            return;
        }

        swap(array , index , largestIndex);
        heapify(array , largestIndex);
    }

    private static void swap(int[] array , int first , int second) {
        var temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
