package Easy;

import Trees.TreeNode;

import static Trees.TreeNode.buildTree;
import static Trees.TreeNode.printLevelOrder;

public class prblm101SymmetricTree {
    public static void main(String[] args) {
        Integer[] input = {1,2,2,null,3,null,3};
        TreeNode.Node root = buildTree(input);
        System.out.println(isSymmetric(root));
    }

    public static boolean isSymmetric(TreeNode.Node  root) {
        if(root == null){
            return true;
        }
        TreeNode.Node  node1 = root.left;
        TreeNode.Node  node2 = root.right;
        return checkSame(node1, node2);
    }
    private static boolean checkSame(TreeNode.Node  node1,TreeNode.Node  node2){
        if(node1 == null && node2 == null){
            return true;
        }
        if(node1 == null || node2 == null && (node1.val != node2.val)){
            return false;
        }
        return checkSame(node1.left , node2.right) && checkSame(node1.right , node2.left);
    }
}
