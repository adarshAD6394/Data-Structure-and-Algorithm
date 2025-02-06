package medium;
import java.util.*;
import Trees.TreeNode;

import static Trees.TreeNode.buildTree;

public class prblm1305Elements2BST {
    public void main(String[] args) {
        Integer[] input1 = {10,5,15,3,7,13,18,1,null,6};
        Integer[] input2 = {10,5,15,3,7,13,18,1,null,6};
        TreeNode.Node root1 = buildTree(input1);
        TreeNode.Node root2 = buildTree(input2);
        System.out.println(getAllElements(root1, root2));
    }
    public List<Integer> getAllElements(TreeNode.Node root1, TreeNode.Node root2) {
        List<Integer> l1 = new LinkedList<>(); ToList(root1, l1);
        List<Integer> l2 = new ArrayList<>(); ToList(root2, l2);
        List<Integer> l3 = new ArrayList<>();
        while(!l1.isEmpty() && !l2.isEmpty()){
            if(l1.getFirst().equals(l2.getFirst())){
                l3.add(l2.removeFirst());
                l3.add(l1.removeFirst());
            }else if(l1.getFirst() > l2.getFirst()){
                l3.add(l2.removeFirst());
            }else {
                l3.add(l1.removeFirst());
            }
        }
        if(l1.isEmpty()){
            l3.addAll(l2);
        }
        else{
            l3.addAll(l1);
        }
        return l3;
    }
    public List<Integer> ToList(TreeNode.Node node, List<Integer> n){
        if(node == null) return null;
        ToList(node.left , n);
        n.add(node.val);
        ToList(node.right, n);
        return n;
    }
}
