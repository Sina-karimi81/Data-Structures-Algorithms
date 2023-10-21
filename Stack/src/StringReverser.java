import java.util.Stack;

public class StringReverser {
    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }

        var stack = new Stack<Character>();

        for (Character character:input.toCharArray()) {
            stack.push(character);
        }

        StringBuilder reverse = new StringBuilder();

        while (!stack.empty()) {
            reverse.append(stack.pop());
        }

        return reverse.toString();
    }
}
