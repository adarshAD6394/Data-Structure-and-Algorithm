package medium;

import java.util.*;
import Trees.TreeNode;

import static Trees.TreeNode.buildTree;
import static Trees.TreeNode.printLevelOrder;

public class prblm113PathSumII {
    public void main(String[] args) {
        Integer[] input = {5, 4, 8, 11, 13, 9, 6, 7, 2, 12, 14, 10, 3, 15, 1, 8, 9, 4, 5, 6, 7, 8, 2, 1, 5, 3, 4, 7, 6, 9, 2, 10, 12, 1, 14, 13, 11, 5, 8, 6, 3, 7, 2, 9, 4, 10, 15, 12, 1, 11};
        TreeNode.Node root = buildTree(input);
        printLevelOrder(root);
        int targetSum = 45;
        System.out.println(pathSum(root, targetSum));
    }
    public List<List<Integer>> pathSum(TreeNode.Node root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> bas = new ArrayList<>();
        pathsum(ans, bas, targetSum, root);
        return ans;
    }

    public List<Integer> pathsum(List<List<Integer>> ans, List<Integer> bas, int targetSum, TreeNode.Node node){
        if(node == null) return null;
        else{
          if(node.left == null && node.right == null){
              if(targetSum-node.val == 0){
                  bas.add(node.val);
                  List<Integer> mid = new ArrayList<>(bas);
                  ans.add(mid);
                  bas.removeLast();
              }
              return bas;
          }
          else {
              bas.add(node.val);
          }
          pathsum(ans, bas, targetSum - node.val, node.left);
          pathsum(ans, bas, targetSum - node.val, node.right);
          bas.removeLast();
        }
        return bas;
    }
}

