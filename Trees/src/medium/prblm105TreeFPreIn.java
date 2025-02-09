package medium;

import Trees.TreeNode;

import static Trees.TreeNode.Node;
import static Trees.TreeNode.printLevelOrder;

public class prblm105TreeFPreIn {
    public void main(String[] args) {
//        Integer[] input = {5,3,7,3,4,6,8,2,3};
//        TreeNode.Node root = buildTree(input);
        int[] p = {10, 5, 3, 1, 4, 7, 6, 9, 8, 15, 13, 12, 14, 18, 16, 20};
        int[] i = {1, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 18, 20};
        printLevelOrder(buildTree(p,i));
    }
    public TreeNode.Node buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0) return null;
        if(preorder.length == 1) return new TreeNode.Node(preorder[0]);
        return build( preorder,inorder);
    }
    public TreeNode.Node build(int[] preorder, int[] inorder){
       if(preorder.length == 0) return null;
       if(preorder.length == 1){
           return new TreeNode.Node(preorder[0]);
       }
       TreeNode.Node node = new TreeNode.Node(preorder[0]);
       int r = search(node.val, inorder);
       int[] leftI = new int[r];
        for (int i = 0; i < r; i++) {
            leftI[i] = inorder[i];
        }
       int[] rightI = new int[inorder.length-r-1];
        for (int i = 0; i < inorder.length-r-1; i++) {
            rightI[i] = inorder[r+1+i];
        }
       int[] leftP = new int[leftI.length];
        for (int i = 0; i < leftI.length; i++) {
            leftP[i] = preorder[i+1];
        }
       int[] rightP = new int[rightI.length];
        for (int i = 0; i < rightI.length; i++) {
            rightP[i] = preorder[i+1+leftP.length];
        }
        node.left = build(leftP, leftI);
        node.right = build(rightP, rightI);
        return node;
    }

    public int search(int m, int[] inorder){
        int n = 0;
        for(int i = 0; i<inorder.length;i++){
            if(m == inorder[i]){
                n = i;
                break;
            };
        }
        return n;
    }



}
