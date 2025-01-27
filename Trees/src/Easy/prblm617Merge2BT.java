package Easy;

import Trees.TreeNode;

import static Trees.TreeNode.buildTree;
import static Trees.TreeNode.printLevelOrder;

public class prblm617Merge2BT {
    public static void main(String[] args) {
//        pre order tree
//  1,2,3,4,5,null,8,null,null,6,7,9
        Integer[] input1 = {};
        Integer[] input2 = {4,1,2,1};
        TreeNode.Node root1 = buildTree(input1);
        TreeNode.Node root2 = buildTree(input2);

        printLevelOrder(root1);
        printLevelOrder(root2);
        printLevelOrder(mergeTrees(root1, root2));

    }
    public static TreeNode.Node mergeTrees(TreeNode.Node root1, TreeNode.Node root2) {
        if(root1 == null && root2 == null){
            return null;
        }
        if((root1 == null && root2 != null) || (root1 != null && root2 == null)){
            if(root1 == null){
                return root2;
            }else {
                return root1;
            }
        }
        root1.val = root1.val + root2.val;
        if((root1.left != null && root2.left != null) || (root1.right != null && root2.right != null)){
            mergeTrees(root1.left, root2.left);
            mergeTrees(root1.right, root2.right);
        }
        if((root1.left == null && root2.left != null) || (root1.left != null && root2.left == null)) {
            if(root1.left == null) {
                root1.left = root2.left;
            }
        }
        if((root1.right == null && root2.right != null) || (root1.right != null && root2.right == null)) {
            if(root1.right == null) {
                root1.right = root2.right;
            }
        }
        return root1;
    }
    TreeNode.Node easySyntax(TreeNode.Node root1, TreeNode.Node root2){
        if(root1==null){
            return root2;
        }
        if(root2==null){
            return root1;
        }
        root1.val=root1.val+root2.val;
        root1.left=mergeTrees(root1.left,root2.left);
        root1.right=mergeTrees(root1.right,root2.right);
        return root1;

    }
}
