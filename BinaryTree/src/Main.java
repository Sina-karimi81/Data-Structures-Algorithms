import java.util.List;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.println("tree.isBinarySearchTree() = " + tree.isBinarySearchTree());

        Tree tree2 = new Tree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(10);

        List<Integer> nodeAtDistance = tree.getNodesAtDistance(2);
        for (var i: nodeAtDistance) {
            System.out.println(i);
        }

        System.out.println("------------ level Order -----------");
        tree.levelOrderTraversal();
        System.out.println("------------ level Order -----------");

        System.out.println("tree.equals(tree2) = " + tree.equals(tree2));
        System.out.println("tree.minimumValue() = " + tree.minimumValue());
        System.out.println("Done");
        System.out.println("tree.find(10) = " + tree.find(100));
        System.out.println("tree.find(10) = " + tree.find(10));
        tree.deleteValue(9);
        tree.deleteValue(4);
        System.out.println("tree.isBinarySearchTree() = " + tree.isBinarySearchTree());
        System.out.println("done 2");
        tree.traversePreOrder();
        tree.traverseInOrder();
        tree.traversePostOrder();
        System.out.println("tree.heightOfTree() = " + tree.heightOfTree());
    }

}
