//package Easy;
//
//import Trees.TreeNode;
//
//import static Trees.TreeNode.buildTree;
//
//public class prblm110BalancedBT {
//    public static void main(String[] args) {
//        Integer[] input = {3,9,20,null,null,15,7};
//        TreeNode.Node root = buildTree(input);
//        boolean ans = false;
//        System.out.println(isBalanced(root, ans));
//    }
//    public static boolean isBalanced(TreeNode.Node root, boolean ans) {
//        if (root == null) return true;
//        int lh = 1 + isBalanced(root.left);
//        int rh = 1 + isBalanced(root.right);
//        if ((lh - rh) >= -1 && (lh - rh) <= 1) {
//            return ans = true;
//        } else {
//            return ans = false;
//        }
//    }
//        public static int isBalanced(TreeNode.Node root) {
//            if(root == null) return 0;
//            int lh = 1+isBalanced(root.left);
//            int rh = 1+isBalanced(root.right);
//                return lh-rh;
//        }
//    }
//}
