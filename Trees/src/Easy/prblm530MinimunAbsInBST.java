package Easy;

import Trees.TreeNode;

import static Trees.TreeNode.buildTree;

public class prblm530MinimunAbsInBST {
    public void main(String[] args) {
        Integer[] input = {10, 5, 15, 3, 8, null, 18};
        TreeNode.Node root = buildTree(input);
        System.out.println(getMinimumDifference(root));
    }
    private int min = Integer.MAX_VALUE;
    private TreeNode.Node prev = null;
    public int getMinimumDifference(TreeNode.Node root) {
        if(root == null){
            return 0;
        }
        inorder(root);
        return min;
    }
    public void inorder(TreeNode.Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        if(prev != null){
            min = Math.min(min, root.val - prev.val);
        }
        prev = root;
        inorder(root.right);
    }
}
