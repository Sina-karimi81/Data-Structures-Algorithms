import java.util.Collections;

public class Array {

    private int[] array;
    private int count = 0;

    public Array(int size) {
        array = new int[size];
    }

    // O(1)
    public void insert(int number) {
        if (count == array.length) {
            int newSize = array.length * 2;
            int[] newArray = new int[newSize];

            /*
             the below method is equal to:
             for(int i = 0 ; i < index ; i++) {
                newArray[i] = array[i]
             }
             */
            System.arraycopy(array, 0, newArray, 0, array.length);

            array = newArray;
        }
        array[count] = number;
        count++;
    }

    // O(n)
    public void removeAt(int index) {

        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("wrong index");
        } else {
            for (int i = index; i < count; i++) {
                array[i] = array[i+1];
            }
            count--;
        }

    }

    // O(n)
    public int indexOf(int item) {
        int resultIndex = -1;

        for (int i = 0; i < array.length; i++) {
            int tempItem = array[i];

            if(tempItem == item) {
                return i;
            }
        }
        return resultIndex;
    }

    // O(1)
    public int get(int index) {
        if (index < 0 || index >= count)
            throw new IndexOutOfBoundsException();
        return array[index];
    }

    //O(n)
    public int max() {
        int max = 0;

        for (int i = 0; i < count; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    //O(n + m)
    public Array intersect(int[] inputArray) {
        Array result;

        if(count < inputArray.length) {
            result = new Array(count);
        } else {
            result = new Array(inputArray.length);
        }

        int index = 0;
        for (int i = 0 ; i < count ; i++) {
            for (int second: inputArray) {
                if (array[i] == second) {
                    result.insert(second);
                }
            }
        }

        return result;
    }

    //O(n)
    public void reverse() {

        for (int i = 0; i < count-1; i++) {
            int tempVar = array[i];
            array[i] = array[count - i - 1];
            array[count - i - 1] = tempVar;
        }

    }

    public void insertAt(int index , int item) {
        if(index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }

        array[index] = item;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < count; i++) {
            result.append(array[i]).append(", ");
        }
        result.delete(result.length()-2 ,result.length()-1);
        result.append("]");

        return result.toString();
    }
}
