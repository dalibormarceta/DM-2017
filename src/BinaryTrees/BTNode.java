package BinaryTrees;

class BTNode {
    private int key;
    BTNode left;
    BTNode right;

    BTNode (int key) {
        this.key = key;
        right = null;
        left = null;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setLeft(BTNode left) {
        this.left = left;
    }

    public BTNode getLeft() {
        return left;
    }

    public void setRight(BTNode right ) {
        this.right = right;
    }

    public BTNode getRight() {
        return right;
    }

}
