package medium;

import Trees.TreeNode;

import static Trees.TreeNode.buildTree;

public class prblm230KthSmallestElement {
    public void main(String[] args) {
        Integer[] input = {5,3,7,3,4,6,8,2,3};
        TreeNode.Node root = buildTree(input);
        int n = 4;
        System.out.println(kthSmallest(root, n));
    }
    int count = 0;
    int ans = 0;
    public int kthSmallest(TreeNode.Node node, int k) {
        if(node == null) return 0;
        kthSmallest(node.left, k);
        count++;
        if(count == k){
            return ans = node.val;
        }
        kthSmallest(node.right, k);
        return ans;
    }

}
