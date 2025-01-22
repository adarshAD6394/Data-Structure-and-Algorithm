package Easy;

import Trees.TreeNode;
import java.util.*;
import static Trees.TreeNode.buildTree;
import static Trees.TreeNode.printLevelOrder;

public class prblm100SameTree {
    public static void main(String[] args) {
//        pre order tree
//  1, 2, 3,4,5,6,7,8,9,10,11,12
        Integer[] input1 = {2,2,2,null,2,null,null,2};
        Integer[] input2 = {2,2,2,2,null,2,null};
        TreeNode.Node root1 = buildTree(input1);
        TreeNode.Node root2 = buildTree(input2);
        printLevelOrder(root1);
        printLevelOrder(root2);
        System.out.println(isSameTree(root1,root2));

    }
    public static boolean isSameTree(TreeNode.Node p, TreeNode.Node q) {
        List<TreeNode.Node> p1 = new ArrayList<>();
        List<TreeNode.Node> q1 = new ArrayList<>();
        inorder(p,p1);
        inorder(q,q1);
        System.out.println(p1);
        System.out.println(q1);
        boolean ans = true;
        if(p1.size() == q1.size()){
            for(int i = 1;i<p1.size();i++){
                if(!Objects.equals(p1.get(i), q1.get(i))){
                    ans = false;
                    break;
                }
            }
        }
        return ans;
    }
    private static void inorder(TreeNode.Node node, List<TreeNode.Node> queue){
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            return;
        }
        if( node.left == null && node.right != null){
            queue.add(null);
        }
        inorder(node.left, queue);
        queue.add(node);
        if( node.right == null && node.right != null){
            queue.add(null);
        }
        inorder(node.left, queue);

    }
}
