package medium;

import Trees.TreeNode;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Queue;

import static Trees.TreeNode.buildTree;
import static Trees.TreeNode.printLevelOrder;

public class prblm662Maxwidth {
    public void main(String[] args) {
        Integer[] input = {1,3,2,5,null,null,9,6,null,7};
        TreeNode.Node root = buildTree(input);
        printLevelOrder(root);
        System.out.println(widthOfBinaryTree(root));
    }
    public int widthOfBinaryTree(TreeNode.Node root) {
        if(root == null) return 0;

        int max = Integer.MIN_VALUE;
        Queue<AbstractMap.SimpleEntry<TreeNode.Node,Integer>> list = new LinkedList<>();
        list.offer(new AbstractMap.SimpleEntry<>(root, 0));

        while(!list.isEmpty()){
            int size = list.size();
            int left = list.peek().getValue();
            int right = left;

            for(int i = 0; i<size;i++){
                AbstractMap.SimpleEntry<TreeNode.Node, Integer> curr = list.poll();
                TreeNode.Node node = curr.getKey();
                int index = curr.getValue();
                right = index;

                if(node.left != null) list.offer(new AbstractMap.SimpleEntry<>(node.left,2*index ));
                if(node.right != null) list.offer(new AbstractMap.SimpleEntry<>(node.left,2*index+1));
            };
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}
