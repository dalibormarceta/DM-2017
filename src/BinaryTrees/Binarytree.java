package BinaryTrees;

import BinaryTrees.BTNode;

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

    public boolean isBalanced(BTNode root) {

        return (maxdepth(root) - mindepth(root) < 2);
    }

    public int maxdepth(BTNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxdepth(root.left), maxdepth(root.right));
    }

    public int mindepth(BTNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.min(mindepth(root.left), mindepth(root.right));
    }

}
