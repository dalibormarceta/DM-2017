
/**
 * Created by marceta on 6/7/17.
 */

public class Binarytree
{
    private static BTNode root;

    public Binarytree(int data)
    {
        root = new BTNode(data);
    }

    public void add(BTNode parent, BTNode child, String orientation)
    {
        if (orientation.equals("left"))
        {
            parent.setLeft(child);
        }
        else
        {
            parent.setRight(child);
        }
    }

    public static boolean isBalanced(BTNode root) {

        return (maxdepth(root) - mindepth(root) < 2);
    }

    public static int maxdepth(BTNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxdepth(root.left), maxdepth(root.right));
    }

    public static int mindepth(BTNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.min(mindepth(root.left), mindepth(root.right));
    }

    public static void main(String args[])
    {
        BTNode n1 = new BTNode(1);
        BTNode n2 = new BTNode(4);
        BTNode n3 = new BTNode(2);
        BTNode n4 = new BTNode(5);

        Binarytree tree = new Binarytree(3); //  3
        tree.add(root, n1, "left"); //         1/ \
        tree.add(root, n2, "right"); //            4
        tree.add(n2, n3, "left"); //             2/ \
        tree.add(n2, n4, "right"); //                5

        boolean result = isBalanced(root);
        System.out.println( "Node is balanced " + result);
    }
}

class BTNode {
    private int key;
    private BTNode left;
    private BTNode right;

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