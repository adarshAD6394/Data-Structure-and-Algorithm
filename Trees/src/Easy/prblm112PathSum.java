package Easy;

import Trees.TreeNode;

import static Trees.TreeNode.buildTree;
import static Trees.TreeNode.printLevelOrder;

public class prblm112PathSum {
    public void main(String[] args) {
        Integer[] input = {};
        TreeNode.Node root = buildTree(input);
        int n = ;
        printLevelOrder(root);
        System.out.println(hasPathSum(root, n));
    }
    boolean ans = false;
    int sum = 0;
    public boolean hasPathSum(TreeNode.Node root, int targetSum) {
        if (root == null) return ans;
        else {
            if (root.right == null && root.left == null) {
                sum = sum + root.val;
                if (sum == targetSum) {
                    ans = true;
                }
            } else {
                sum = sum + root.val;
            }
            if (root.left != null) {
                hasPathSum(root.left, targetSum);
            }
            if (root.right != null) {
                hasPathSum(root.right, targetSum);
            }
            sum = sum - root.val;
            return ans;
        }
    }
}
