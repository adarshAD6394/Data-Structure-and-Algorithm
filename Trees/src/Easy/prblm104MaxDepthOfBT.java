package Easy;

import Trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static Trees.TreeNode.buildTree;

public class prblm104MaxDepthOfBT {
    public static void main(String[] args) {
        Integer[] input = {3,9,20,null,null,15,7};
        TreeNode.Node root = buildTree(input);
        System.out.println(maxDepth(root));
    }
    public static int maxDepth(TreeNode.Node root) {
        if(root == null) return 0;
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        return 1+Math.max(lh, rh);
    }

}
