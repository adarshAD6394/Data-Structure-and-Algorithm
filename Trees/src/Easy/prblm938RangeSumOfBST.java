package Easy;

import Trees.TreeNode;

import static Trees.TreeNode.buildTree;
import static Trees.TreeNode.printLevelOrder;

public class prblm938RangeSumOfBST {

    int sum = 0;
    public void main(String[] args) {
        Integer[] input = {10,5,15,3,7,13,18,1,null,6};
        TreeNode.Node root = buildTree(input);
        int n = 6;
        int m = 10;
        System.out.println(rangeSumBST(root, n, m));
    }
    public int rangeSumBST(TreeNode.Node root, int low, int high) {
        if(root == null) return 0;
        if(root.val <= high && root.val>= low){
            sum = sum + root.val;
        }
        if(low<root.val) rangeSumBST(root.left,  low,  high);
        if(root.val<high)rangeSumBST(root.right,  low,  high);
        return sum;
    }
}
