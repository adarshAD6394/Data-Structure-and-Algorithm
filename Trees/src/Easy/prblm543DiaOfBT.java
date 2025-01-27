package Easy;

import Trees.TreeNode;

import static Trees.TreeNode.buildTree;

public class prblm543DiaOfBT {
    private int d = 0;
    public void main(String[] args) {
        Integer[] input = {1,2,3,4,5};
        TreeNode.Node root = buildTree(input);
        System.out.println(diameterOfBinaryTree(root));
    }
    public int diameterOfBinaryTree(TreeNode.Node root) {
        if(root == null){
            return 0;
        }
        depth(root);
        return d;
    }
    int depth(TreeNode.Node root){
        if(root == null){
            return 0;
        }
        int lh = depth(root.left);
        int rh = depth(root.right);
        d = Math.max(d, lh+rh);
        return 1+ Math.max(lh,rh);
    }
}
