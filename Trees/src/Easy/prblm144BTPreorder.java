package Easy;
import java.util.*;
import Trees.TreeNode;

import static Trees.TreeNode.buildTree;
import static Trees.TreeNode.printLevelOrder;

public class prblm144BTPreorder {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,5,null,8,null,null,6,7,9};
        TreeNode.Node root = buildTree(input);
        printLevelOrder(root);
        System.out.println(preorderTraversal(root).toString());
    }
    public static List<Integer> preorderTraversal(TreeNode.Node root) {
        List<Integer> queue = new ArrayList<>();
        preorderTraversal(root, queue);
        return queue;
    }
    private static void preorderTraversal(TreeNode.Node node, List<Integer> queue){
        if(node == null){
            return;
        }
        queue.add(node.val);
        preorderTraversal(node.left, queue);
        preorderTraversal(node.right, queue);
    }
}
