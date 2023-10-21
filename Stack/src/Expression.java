import java.util.Stack;

public class Expression {

    public boolean isBalanced(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }

        var stack = new Stack<Character>();

        for (Character character:input.toCharArray()) {
            if(isLeftBracket(character)) {
                stack.push(character);
            }

            if (isRightBracket(character)) {
                if (stack.empty()) {
                    return false;
                }

                if (bracketsMatch(stack.peek() , character)) {
                    stack.pop();
                }
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(Character character) {
        return character.equals('(') || character.equals('{') || character.equals('[') || character.equals('<');
    }

    private boolean isRightBracket(Character character) {
        return character.equals(')') || character.equals('}') || character.equals(']') || character.equals('>');
    }

    private boolean bracketsMatch(Character left , Character right) {
        return (right == ')' && left == '(') ||
                (right == '}' && left == '{') ||
                (right == ']' && left == '[') ||
                (right == '>' && left == '<');
    }

}
