import java.util.ArrayList;
import java.util.List;

public class Trie {
    private final Node root = new Node(' ');


    public void insert(String word) {
        word = word.toLowerCase();

        var current = root;

        for (var ch: word.toCharArray()) {

            if (!current.hasChild(ch)) {
                current.addChild(ch);
            }
            current = current.getChild(ch);
        }
        current.setEndOfWord(true);
    }

    public boolean contains(String word) {
        if (word == null) {
            throw new IllegalArgumentException();
        }

        word = word.toLowerCase();

        var current = root;

        for (var ch : word.toCharArray()) {

            if (!current.hasChild(ch)) {
                return false;
            }
            current = current.getChild(ch);
        }

        return current.isEndOfWord();
    }

    public void remove(String word) {
        word = word.toLowerCase();
        remove(root , word , 0);
    }

    private void remove(Node root , String word , int index) {
        if (index == word.length()) {
            root.setEndOfWord(false);
            return;
        }

        var ch = word.charAt(index);
        var child = root.getChild(ch);
        if (child == null) {
            return;
        }

        remove(child , word , index + 1);

        if (!child.hasChildren() && !child.isEndOfWord()) {
            root.removeChild(ch);
        }
    }

    public void traverse() {
        preOrder(root);
        postOrder(root);
    }

    private void preOrder(Node root) {
        System.out.println(root.getValue());

        for (Node node: root.getAllChildren()) {
            preOrder(node);
        }

        if (root.isEndOfWord()) {
            System.out.println("====== pre order ======");
        }
    }

    private void postOrder(Node root) {
        if (root.isEndOfWord()) {
            System.out.println("====== post order ======");
        }

        for (Node node: root.getAllChildren()) {
            postOrder(node);
        }

        System.out.println(root.getValue());
    }

    public List<String> autoCompletion(String prefix) {
        prefix = prefix.toLowerCase();
        List<String> words = new ArrayList<>();
        Node lastNodeOf = findLastNodeOf(prefix);
        findWords(lastNodeOf , prefix , words);
        return words;
    }

    private void findWords(Node root , String prefix , List<String> words) {
        if (root == null) {
            return;
        }

        if (root.isEndOfWord()) {
            words.add(prefix);
        }

        for (var child : root.getAllChildren()) {
            findWords(child , prefix + child.getValue() , words);
        }
    }

    private Node findLastNodeOf(String prefix) {
        if (prefix == null) {
            return null;
        }

        var current = root;
        for (var ch: prefix.toCharArray()) {
            var child = current.getChild(ch);
            if (child == null) {
                return null;
            }
            current = child;
        }
        return current;
    }
}
