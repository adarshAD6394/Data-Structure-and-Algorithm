package Easy;

import Trees.TreeNode;
import java.util.*;
import static Trees.TreeNode.*;

public class prblm94BTInorder {
    public static void main(String[] args) {
//        pre order tree
//  1, 2, 3,4,5,6,7,8,9,10,11,12
        Integer[] input = {5,3,7,3,4,6,8,2,3};
        TreeNode.Node root = buildTree(input);
        printLevelOrder(root);
        System.out.println(inorder(root).toString());

    }

    public static List<Integer> inorder(TreeNode.Node root){
        List<Integer> queue = new LinkedList<>();
        inorder(root, queue);
        return queue;

    }
    private static void inorder(TreeNode.Node node, List<Integer> queue){
        if(node == null){
            return;
        }
        inorder(node.left, queue);
        queue.add(node.val);
        inorder(node.right, queue);
    }

//    public static List<Integer> inorder(TreeNode.Node root, List<Integer> queue, Stack s){
//        if (root.left != null && root.right != null) {
//            s.push(root.val);
//        }
//        if((root.left == null && root.right != null) || (root.left != null && root.right == null) ){
//            s.push(root.val);
//        }
//        if(root.left != null){
//            inorder(root.left, queue,s);
//        }
//        if(root.left == null && root.right == null){
//            queue.add(root.val);
//            return queue;
//        }else if(!s.isEmpty()){
//            queue.add((int) s.pop());
//        }
//        if(root.right != null){
//            inorder(root.right, queue,s);
//        }
//        return queue;
//    }
}
