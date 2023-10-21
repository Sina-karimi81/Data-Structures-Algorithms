import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        var stringReverser = new StringReverser();
        var str1 = "Hello World";
        System.out.println("str1 = " + str1);
        System.out.println("stringReverser.reverse(str1) = " + stringReverser.reverse(str1));

        var expressionBalanceChecker = new Expression();
        var str = "(1 + 2)[54]<>";
        System.out.println("str = " + str);
        System.out.println("expressionBalanceChecker.isBalanced(str) = " + expressionBalanceChecker.isBalanced(str));
        var negStr = "(1 + 2)[54]<>((";
        System.out.println("negStr = " + negStr);
        System.out.println("expressionBalanceChecker.isBalanced(negStr) = " + expressionBalanceChecker.isBalanced(negStr));
        var edgeCase = ")(}{][><";
        System.out.println("edgeCase = " + edgeCase);
        System.out.println("expressionBalanceChecker.isBalanced(edgeCase) = " + expressionBalanceChecker.isBalanced(edgeCase));

        var stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("stack = " + stack);
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack = " + stack);
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);
        System.out.println("stack.isEmpty() = " + stack.isEmpty());
    }

}
