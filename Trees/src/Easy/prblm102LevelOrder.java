package Easy;

import Trees.TreeNode;
import com.sun.source.tree.Tree;

import java.util.*;
import static Trees.TreeNode.buildTree;
import static Trees.TreeNode.printLevelOrder;

public class prblm102LevelOrder {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,5,null,8,null,null,6,7,9};
        TreeNode.Node root = buildTree(input);
        printLevelOrder(root);
        System.out.println(levelorderTraversal(root).toString());
    }
    public static List<List<Integer>> levelorder(TreeNode.Node node){
        if(node == null) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode.Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            List<Integer> t = new ArrayList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                t.add(queue.peek().val);
                TreeNode.Node curr = queue.poll();
                if(curr.left != null) queue.offer(curr.left);
                if(curr.right != null) queue.offer(curr.right);
            }
            ans.add(t);
        }
        return ans;
    }
    public static List<List<Integer>> levelorderTraversal(TreeNode.Node node){
        List<List<Integer>> ans = new ArrayList<>();
        levelorderTraversal(node, ans);
        return ans;
    }
    private static void levelorderTraversal(TreeNode.Node node, List<List<Integer>> queue){
        if(node == null) return ;
        List<TreeNode.Node> s = new ArrayList<>();
        s.add(node);
        while (!s.isEmpty()){
            List<Integer> t = new ArrayList<>();
            int len = s.size();
            for (int i = 0; i < len; i++) {
                TreeNode.Node curr = s.get(i);
                t.add(curr.val);
            }
            queue.add(t);
            for (int i = len; i > 0; i--) {
                TreeNode.Node curr = s.getFirst();
                if(curr.left != null) s.add(curr.left);
                if(curr.right != null) s.add(curr.right);
                s.removeFirst();
            }
        }
    }
}
