package Easy;

import Trees.TreeNode;
import java.util.*;
import static Trees.TreeNode.buildTree;
import static Trees.TreeNode.printLevelOrder;

public class prblm100Same {
    public static void main(String[] args) {
        Integer[] input1 = {1,2,3,4,5,null,8,null,null,6,7,9};
        TreeNode.Node root1 = buildTree(input1);
        printLevelOrder(root1);
        Integer[] input2 = {1,2,3,4,5,null,8,null,null,6,7,9};
        TreeNode.Node root2 = buildTree(input2);
        printLevelOrder(root2);
        System.out.println(isSameTree(root1, root2));
    }
    public static boolean isSameTree(TreeNode.Node p, TreeNode.Node q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null || q.val != p.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
