package medium;

import Trees.TreeNode;

import static Trees.TreeNode.buildTree;

public class prblm98validateBST {
    public void main(String[] args) {
        Integer[] input = {10,5,15,null,null,6,20};
        TreeNode.Node root = buildTree(input);
        System.out.println(isValidBST(root));
    }
    boolean ans = true;
    public boolean isValidBST(TreeNode.Node root) {
        if(root == null){
            return false;
        }
        inorder(root);
        return ans;
    }
    public void inorder(TreeNode.Node node){
        if(node.left == null && node.right == null) return;
        if(node.left.val>=node.val || node.right.val<=node.val ) ans = false;
        inorder(node.left);
        inorder(node.right);
    }
}
