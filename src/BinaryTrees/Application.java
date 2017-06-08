package BinaryTrees;

/**
 * Created by marceta on 6/8/17.
 */
public class Application {
    public static void main(String args[])
    {
        BTNode n1 = new BTNode(1);
        BTNode n2 = new BTNode(4);
        BTNode n3 = new BTNode(2);
        BTNode n4 = new BTNode(5);

        Binarytree binaryTree = new Binarytree(3); //  3
        BTNode root = new BTNode(1);
        binaryTree.add(root, n1, "left"); //         1/ \
        binaryTree.add(root, n2, "right"); //            4
        binaryTree.add(n2, n3, "left"); //             2/ \
        binaryTree.add(n2, n4, "right"); //                5

        boolean result = binaryTree.isBalanced(root);
        System.out.println( "Node is balanced " + result);
    }
}
