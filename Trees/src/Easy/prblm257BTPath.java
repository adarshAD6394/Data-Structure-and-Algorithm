package Easy;

import java.util.*;
import Trees.TreeNode;

import static Trees.TreeNode.buildTree;
import static Trees.TreeNode.printLevelOrder;

public class prblm257BTPath {
    public void main(String[] args) {
        Integer[] input = {1,2,3,null,5};
        TreeNode.Node root = buildTree(input);
        printLevelOrder(root);
        System.out.println(binaryTreePaths(root));
    }
    List<String> ans = new ArrayList<>();
    StringBuilder path = new StringBuilder();
    public List<String> binaryTreePaths(TreeNode.Node root) {
        if(root == null) return null;
        if(root.right == null && root.left == null){
            path.append(root.val);
            ans.add(path.toString());
            int n = path.length();
            String m = ""+root.val;
            path.delete(n-1-(m.length()-1),n);
            return ans;
        }else{
            path.append(root.val).append("->");
        }
        if(root.left != null){
            binaryTreePaths(root.left);
        }
        if(root.right != null){
            binaryTreePaths(root.right);
        }
        int n = path.length();
        String m = ""+root.val;
        path.delete(n-1-(m.length()-1)-2,n);
        return ans;
    }
}
