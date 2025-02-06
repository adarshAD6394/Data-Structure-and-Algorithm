//package medium;
//import java.util.*;
//import Trees.TreeNode;
//
//import static Trees.TreeNode.buildTree;
//
//public class prblm450DeleteNodeInBst {
//    public void main(String[] args) {
//        Integer[] input = {10,5,15,3,7,13,18,1,null,6};
//        TreeNode.Node root = buildTree(input);
//        int n = 3;
//        System.out.println(search(root, n));
//    }
//    int min = Integer.MAX_VALUE;
//    int max = Integer.MAX_VALUE;
//    List<TreeNode.Node> mi = new ArrayList<>(2);
//    public TreeNode.Node deleteNode(TreeNode.Node root, int key) {
//        if(root == null) return null;
//        if(root.val == key){
//            return root;
//        }
//        List<TreeNode.Node> node = search(root, key);
//        TreeNode.Node gp = list.getFirst();
//        TreeNode.Node p = list.getLast();
//        TreeNode.Node c = null;
//        if(p.left != null){
//           c = searchMax(p.left);
//
//        }else if(p.left == null && p.right != null){
//            c = searchMin(p.right);
//        }
//
//        return root;
//    }
//    List<TreeNode.Node> list = null;
//    List<TreeNode.Node> search(TreeNode.Node node, int val) {
//        if (node.left == null && node.right == null) return null;
//        if(node.val<val){
//            if(node.right.val == val){
//                list.add(node);
//                list.add(node.right);
//                return list;
//            }
//            search(node.right, val);
//        }
//        else if (node.left != null){
//            if(node.left.val == val){
//                list.add(node);
//                list.add(node.left);
//                return list;
//            }
//            search(node.left, val);
//        }
//        return list;
//    }
//    List<TreeNode.Node> searchMin(TreeNode.Node node){
//        if(node == null ) return null;
//        if(min>node.val){
//            min = node.val;
//            mi = list;
//            searchMin(node.left);
//        }
//        return mi;
//    }
//    List<TreeNode.Node> searchMax(TreeNode.Node node){
//        if(node == null) return null;
//        if(node.val>max){
//            max = node.val;
//            mi = node;
//            searchMax(node.right);
//        }
//        return mi;
//    }
//}
