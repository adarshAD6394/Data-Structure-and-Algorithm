package Easy;

import Trees.TreeNode;


import static Trees.TreeNode.buildTree;
import static Trees.TreeNode.printLevelOrder;

public class prblm653TwoSumIV {

    public void main(String[] args) {
        Integer[] input = {0,-1,2,-3,null,null,4};
        TreeNode.Node root = buildTree(input);
        int n = -4;
        System.out.println(findTarget(root, n));
    }
    public boolean findTarget(TreeNode.Node node, int k) {
        return findTarget(node, node , k);

    }
    public boolean findTarget(TreeNode.Node root, TreeNode.Node node, int k){
        if(node == null){
            return false;
        }
            int n = k-node.val;
            if(searchBST(root, n)){
                return true;
            }else {
                if(n<root.val){
                    return findTarget(root, node.left, k);
                }else{
                   return findTarget(root, node.right, k);
                }
            }
    }

    public static boolean searchBST(TreeNode.Node  root, int val) {
        if(root == null){
            return false;
        }
        if(root.val == val){
            return true;
        }else if(val > root.val ){
            return searchBST(root.right, val);
        }else{
            return searchBST(root.left, val);
        }
    }

}
