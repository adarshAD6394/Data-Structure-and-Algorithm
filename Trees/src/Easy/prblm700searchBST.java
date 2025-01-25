package Easy;

import Trees.TreeNode;

import static Trees.TreeNode.buildTree;
import static Trees.TreeNode.printLevelOrder;

public class prblm700searchBST {
    public static void main(String[] args) {
        Integer[] input = {4,2,7,1,3};
        TreeNode.Node root = buildTree(input);
        int n = 5;
        printLevelOrder(searchBST(root, n));
    }
    public static TreeNode.Node  searchBST(TreeNode.Node  root, int val) {
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }else if(val > root.val ){
            return searchBST(root.right, val);
        }else{
            return searchBST(root.left, val);
        }
    }
}
