package medium;

import Trees.TreeNode;

import java.util.*;
import javafx.util.

import static Trees.TreeNode.buildTree;
import static Trees.TreeNode.printLevelOrder;

public class prblm662Maxwidth {
    public void main(String[] args) {
        Integer[] input = {5,3,7,3,4,6,8,2,3};
        TreeNode.Node root = buildTree(input);
        printLevelOrder(root);
        System.out.println(widthOfBinaryTree(root));
    }
    public int widthOfBinaryTree(TreeNode.Node root) {
        if(root == null) return 0;
        int max = Integer.MIN_VALUE;
        Queue<Pair<TreeNode.Node,Integer>> list = new LinkedList<>();

        while(!list.isEmpty()){
            max = Math.max(list.size(), max);
            TreeNode.Node curr = ;
            for(int i = 0; i<list.size();i++){
                curr = list.poll();
                if(curr.left != null) list.offer(curr.left);
                if(curr.right != null) list.offer(curr.right);
            };
        }
        return max;
    }
}
