package Easy;

import Trees.TreeNode;

import static Trees.TreeNode.buildTree;

public class prblm111mindepth {
    public static void main(String[] args) {
        Integer[] input = {2,null,3,null,4,null,5,null,6};
        TreeNode.Node root = buildTree(input);
        System.out.println(minDepth(root));
    }
    public static int minDepth(TreeNode.Node root) {
        if(root == null) return 0;
        int lh = minDepth(root.left);
        int rh = minDepth(root.right);
        if(lh == 0){
            return rh+1;
        }
        if(lh == 0){
            return rh+1;
        }
        return 1+Math.min(lh, rh);
    }
}
