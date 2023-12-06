import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Heap heap = new Heap();
        System.out.println("Done");

        int[] numbers = {5, 7, 3 , 4 , 8 , 10};
        for (int num: numbers) {
            heap.insert(num);
        }

        //DESC
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = heap.delete();
        }

        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {5, 7, 3 , 4 , 8 , 10};
        for (int num: numbers2) {
            heap.insert(num);
        }

        //ASC
        for (int i = numbers2.length - 1;  i >= 0; i--) {
            numbers2[i] = heap.delete();
        }

        System.out.println(Arrays.toString(numbers2));

        int[] numbers3 = {5, 3, 8 , 4 , 1 , 2};
        MaxHeap.heapify(numbers3);
        System.out.println("done2");

        // Kth largest number
        int[] numbers4 = {5, 3, 8 , 4 , 1 , 2};
        System.out.println(MaxHeap.kthLargestNumber(numbers4 , 2));
    }

}
