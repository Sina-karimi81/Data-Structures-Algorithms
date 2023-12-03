public class AVLTree {

    private class AVLNode {
        int value;
        AVLNode leftNode;
        AVLNode rightNode;

        int height = 0;

        public AVLNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value=" + value;
        }
    }

    private AVLNode root;

    public void insert(int value) {
        root = insert(root , value);
    }

    private AVLNode insert(AVLNode node , int value) {

        if (node == null) {
            return new AVLNode(value);
        }

        if (value < node.value) {
            node.leftNode = insert(node.leftNode , value);
        } else {
            node.rightNode = insert(node.rightNode , value);
        }

        node.height = setHeight(node);

        node = balanceTree(node);

        return node;
    }

    private AVLNode balanceTree(AVLNode root) {
        if (isLeftHeavy(root)) {
            if (balanceFactor(root.leftNode) < 0) {
                root.leftNode = leftRotation(root.leftNode);
            }
            root = rightRotation(root);
        } else if (isRighHeavy(root)) {
            if (balanceFactor(root.rightNode) > 0) {
                root.rightNode = rightRotation(root.rightNode);
            }
            root = leftRotation(root);
        }
        return root;
    }

    private AVLNode leftRotation(AVLNode node) {
        AVLNode newRoot = node.rightNode;

        node.rightNode = newRoot.leftNode;
        newRoot.leftNode = node;

        node.height = setHeight(node);
        newRoot.height = setHeight(newRoot);

        return newRoot;
    }

    private AVLNode rightRotation(AVLNode node) {
        AVLNode newRoot = node.leftNode;

        node.leftNode = newRoot.rightNode;
        newRoot.rightNode = node;

        node.height = setHeight(node);
        newRoot.height = setHeight(newRoot);

        return newRoot;
    }

    private boolean isLeftHeavy(AVLNode node) {
        return balanceFactor(node) > 1;
    }

    private boolean isRighHeavy(AVLNode node) {
        return balanceFactor(node) < -1;
    }

    private int balanceFactor(AVLNode node) {
        return node == null ? 0 : getHeightOfTree(node.leftNode) - getHeightOfTree(node.rightNode);
    }

    private int getHeightOfTree(AVLNode node) {
        return node == null ? -1 : node.height;
    }

    private int setHeight(AVLNode node) {
        return Math.max(getHeightOfTree(node.leftNode) , getHeightOfTree(node.rightNode)) + 1;
    }
}
