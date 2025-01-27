package Easy;

import Trees.TreeNode;

import static Trees.TreeNode.buildTree;
import static Trees.TreeNode.printLevelOrder;

public class prblm226InvertBinnaryTree {
    public static void main(String[] args) {
        Integer[] input = {4,2,7,1,3,6,97};
        TreeNode.Node root = buildTree(input);
        printLevelOrder(root);
        printLevelOrder(invertTree(root));
    }
    public static TreeNode.Node invertTree(TreeNode.Node root) {
        if (root == null) return null;
        TreeNode.Node temp = null;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
