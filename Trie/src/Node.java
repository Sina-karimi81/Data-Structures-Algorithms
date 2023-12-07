import java.util.HashMap;

public class Node {
    private char value;
    private HashMap<Character , Node> children = new HashMap<>();
    private boolean isEndOfWord;

    public Node(char value) {
        this.value = value;
    }

    public boolean hasChild(char ch) {
        return children.containsKey(ch);
    }

    public Node getChild(char ch) {
        return children.get(ch);
    }

    public void addChild(char ch) {
        children.put(ch , new Node(ch));
    }

    public void setEndOfWord(boolean endOfWord) {
        isEndOfWord = endOfWord;
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public Node[] getAllChildren() {
        return children.values().toArray(new Node[0]);
    }

    public char getValue() {
        return value;
    }

    public boolean hasChildren() {
        return !children.isEmpty();
    }

    public void removeChild(char ch) {
        children.remove(ch);
    }

    @Override
    public String toString() {
        return "value=" + value;
    }

}
