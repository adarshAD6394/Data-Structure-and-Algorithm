package Easy;

import Trees.TreeNode;

import static Trees.TreeNode.buildTree;

public class prblm110BalancedBT {
    public static void main(String[] args) {
        Integer[] input = {1,2,2,3,3,null,null,4,4};
        TreeNode.Node root = buildTree(input);
        System.out.println(depth(root));
    }
    public static boolean depth(TreeNode.Node root) {
        return isBalanced(root) != -1;
    }
    public static int isBalanced(TreeNode.Node root) {
        if(root == null) return 0;
        int lh = isBalanced(root.left);
        int rh = isBalanced(root.right);
        if(lh == -1 || rh == -1){
            return -1;
        }
        if(lh-rh>1 || lh-rh<-1) {
            return -1;
        }
        return 1+Math.max(lh, rh);
    }
}


