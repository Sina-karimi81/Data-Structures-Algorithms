import java.util.List;

public class Main {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("Hello");
        trie.insert("cat");
        trie.insert("done");
        trie.insert("donation");
        System.out.println("trie.contains(\"hello\") = " + trie.contains("hello"));
        System.out.println("trie.contains(\"can\") = " + trie.contains("can"));
        System.out.println("trie.contains(\"cat\") = " + trie.contains("cat"));
        System.out.println("trie.contains(\"\") = " + trie.contains(""));
//        System.out.println("trie.contains(null) = " + trie.contains(null));
        trie.traverse();
        trie.remove("cat");
        List<String> don = trie.autoCompletion("don");
        System.out.println(don);
        System.out.println("Done");
    }

}
