
/**
 * Created by marceta on 6/7/17.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Day2_BalancedTree {

    public static void main(TreeNode root) {
        // write your code here

        boolean result = isBalanced(root);
        System.out.println( "Node is balanced " + result);

    }

    public static boolean isBalanced(TreeNode root) {
        return (maxdepth(root) - mindepth(root) < 2);
    }

    private static int maxdepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxdepth(root.left), maxdepth(root.right));
    }

    private static int mindepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.min(mindepth(root.left), mindepth(root.right));
    }
}
