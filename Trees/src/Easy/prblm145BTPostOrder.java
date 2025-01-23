package Easy;

import Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static Trees.TreeNode.buildTree;
import static Trees.TreeNode.printLevelOrder;

public class prblm145BTPostOrder {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,5,null,8,null,null,6,7,9};
        TreeNode.Node root = buildTree(input);
        printLevelOrder(root);
        System.out.println(postorderTraversal(root).toString());
    }
    public static List<Integer> postorderTraversal(TreeNode.Node root) {
        List<Integer> queue = new ArrayList<>();
        postorderTraversal(root, queue);
        return queue;
    }
    private static void postorderTraversal(TreeNode.Node node, List<Integer> queue){
        if(node == null) {
            return;
        }
        postorderTraversal(node.left, queue);
        postorderTraversal(node.right, queue);
        queue.add(node.val);
    }
}
