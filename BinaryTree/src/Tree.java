import java.util.ArrayList;
import java.util.List;

public class Tree {

    private static class Node {
        int value;
        Node leftChild;
        Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void insert(int value) {
        var node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        var current = root;
        while (true) {
            if (value > current.value) {

                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }

                current = current.rightChild;
            } else {

                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }

                current = current.leftChild;
            }
        }
    }

    public boolean find(int value) {

        if (root == null) {
            throw new IllegalStateException();
        }

        var current = root;
        while (current != null) {
            if (value > current.value) {
                current = current.rightChild;
            } else if (value < current.value) {
                current = current.leftChild;
            } else {
                return true;
            }
        }
        return false;
    }

    public void deleteValue(int value) {
        delete(root , value);
    }

    private Node delete(Node root, int value) {
        if (root == null) {
            throw new IllegalArgumentException();
        }

        if (value > root.value) {
            root.rightChild = delete(root.rightChild , value);
        } else if (value < root.value) {
            root.leftChild = delete(root.leftChild , value);
        } else {
            if (isLeafNode(root)) {
                root = null;
            } else if (root.rightChild != null) {
                root.value = findSuccessor(root);
                root.rightChild = delete(root.rightChild , root.value);
            } else {
                root.value = findPredecessor(root);
                root.leftChild = delete(root.leftChild , root.value);
            }
        }

        return root;
    }

    private int findSuccessor(Node root) {
        root = root.rightChild;
        while (root.leftChild != null) {
            root = root.leftChild;
        }

        return root.value;
    }

    private int findPredecessor(Node root) {
        root = root.leftChild;
        while (root.rightChild != null) {
            root = root.rightChild;
        }

        return root.value;
    }

    public void traversePreOrder() {
        System.out.println("------------ Pre Order -----------");
        preOrder(root);
    }

    public void traverseInOrder() {
        System.out.println("------------ In Order -----------");
        inOrder(root);
    }

    public void traversePostOrder() {
        System.out.println("------------ Post Order -----------");
        postOrder(root);
    }

    private void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.value);
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }

    private void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.leftChild);
        System.out.println(root.value);
        inOrder(root.rightChild);
    }

    private void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.println(root.value);
    }

    public int heightOfTree() {
        return height(root);
    }

    // does postOrder Traversal
    private int height(Node root) {
        if (root == null) {
            return -1;
        }

        if (isLeafNode(root)) {
            return 0;
        }

        return 1 + Math.max(height(root.leftChild) , height(root.rightChild));
    }

    public int minimumValue() {
        return min(root);
    }

    // this algorithm is for Binary Tree , O(N)
    private int min(Node root) {

        if (isLeafNode(root)) {
            return root.value;
        }

        var left = min(root.leftChild);
        var right = min(root.rightChild);

        return Math.min(root.value , Math.min(left , right));
    }

    // this algorithm is for binary search tree , O(log n)
//    private int min() {
//        var current = root;
//        var last = current;
//        while (current != null) {
//            last = current;
//            current = current.leftChild;
//        }
//
//        return last.value;
//    }

    private boolean isLeafNode(Node node) {
        return node.leftChild == null && node.rightChild == null;
    }

    public boolean equals(Tree other) {
        if (other == null) {
            return false;
        }

        return equals(root , other.root);
    }

    // Pre Order
    private boolean equals(Node first , Node second) {

        if (first == null && second == null) {
            return true;
        }

        if (first != null && second != null) {
            return first.value == second.value && equals(first.leftChild , second.leftChild) && equals(first.rightChild , second.rightChild);
        }

        return false;
    }

    public boolean isBinarySearchTree() {
        return validate(root , Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    // Pre Order
    private boolean validate(Node node , Integer min , Integer max) {

        if (node == null) {
            return true;
        }

        if (node.value < min || node.value > max) {
            return false;
        }

        return validate(node.leftChild , min , node.value - 1) && validate(node.rightChild , node.value + 1 , max);
    }

    public List<Integer> getNodesAtDistance(int distance) {
        var list = new ArrayList<Integer>();
        getNodesAtDistance(root , distance , list);
        return list;
    }

    private void getNodesAtDistance(Node root , int distance , List<Integer> list) {
        if (root == null) {
            return;
        }

        if (distance == 0) {
            list.add(root.value);
            return;
        }

        getNodesAtDistance(root.leftChild , distance - 1 , list);
        getNodesAtDistance(root.rightChild , distance - 1 , list);
    }

    public void levelOrderTraversal() {
        for (int i = 0; i <= heightOfTree(); i++) {
            for (var val : getNodesAtDistance(i)) {
                System.out.println(val);
            }
        }
    }

}
