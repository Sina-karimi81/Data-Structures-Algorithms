import java.util.Arrays;
import java.util.NoSuchElementException;

public class Stack<E> {

    private Object[] stack;
    private int count = 0;

    public Stack() {
        stack = new Object[10];
    }

    public void push(E element) {

        if (count >= stack.length) {
            var newStack = new Object[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);

            stack = newStack;
        }

        stack[count] = element;
        count++;
    }

    public E pop() {
        if (count == 0) {
            throw new NoSuchElementException();
        }

        var result = stack[count-1];
        stack[count-1] = 0;
        count--;

        return (E) result;
    }

    public E peek() {
        if (count == 0) {
            throw new NoSuchElementException();
        }

        return (E) stack[count-1];
    }

    public boolean isEmpty() {
         return count == 0;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + Arrays.toString(stack) +
                '}';
    }
}
