package medium;

import Trees.TreeNode;

import static Trees.TreeNode.buildTree;
import static Trees.TreeNode.printLevelOrder;

public class prblm129SumRtoL {
    public void main(String[] args) {
        Integer[] input = {1, 2, 3, 4, 5, 6, 7};
        TreeNode.Node root = buildTree(input);
        printLevelOrder(root);
        System.out.println(sumNumbers(root));
    }
    public int sumNumbers(TreeNode.Node root) {
       int sum = 0;
       return sumNumbers(root, 0);

    }
    public int sumNumbers(TreeNode.Node root, int n) {
        if (root == null) return 0;
        n = n * 10 + root.val;
        if (root.left == null && root.right == null) {
            return n;
        }
           return sumNumbers(root.left, n) + sumNumbers(root.right, n);
    }
}
