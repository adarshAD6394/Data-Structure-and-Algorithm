package Trees;

import com.sun.source.tree.Tree;

import java.util.*;


public class TreeNode {

    public static class Node {
        public int val;
        public Node left;
        public Node right;

        // Constructor to initialize val

        public Node(int val) {
            this.val = val;
        }
    }
    public Node root;

    public TreeNode() {
    }
    public TreeNode(int val){}

    public static TreeNode.Node buildTree(Integer[] input){
        if(input == null || input.length == 0 || input[0] == null) {
            return null;
        }
        else{
            TreeNode.Node root = new TreeNode.Node(input[0]);
            List<Node> queue = new ArrayList<>();
            queue.add(root);

            int i = 1;
            while(i<input.length){
                TreeNode.Node  curr = queue.remove(0);

//            Add Left Child
                if(i<input.length && input[i] != null){
                    curr.left = new TreeNode.Node(input[i]);
                    queue.add(curr.left);
                }
                i++;

//            Add right child
                if(i<input.length && input[i] != null){
                    curr.right = new TreeNode.Node(input[i]);
                    queue.add(curr.right);
                }
                i++;
            }
            return root;
        }

    }

    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node val: ");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.val + "? (true/false)");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the val of the left of " + node.val + ":");
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.val + "? (true/false)");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the val of the right of " + node.val + ":");
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(this.root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.val);
        } else {
            System.out.println(node.val);
        }
        prettyDisplay(node.left, level + 1);
    }

    public static void printLevelOrder(TreeNode.Node root) {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        Queue<TreeNode.Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode.Node current = queue.poll();
                assert current != null;
                System.out.print(current.val + " ");

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            System.out.println(); // Move to the next level
        }
    }
}

//package Trees;
//
//
//import java.util.Scanner;
//
//public class TreeNode {
//
//    public static class Node {
//        private int val;
//        private Node left;
//        private Node right;
//
//        public Node() {
//            this.val = val;
//        }
//
//    }
//
//    public Node root;
//
//    public TreeNode() {
//    }
//
//    public void populate(Scanner scanner) {
//        System.out.println("Enter the root Node: ");
//        int val = scanner.nextInt();
//        root = new Node();
//        populate(scanner, root);
//    }
//
//    private void populate(Scanner scanner, Node node) {
//        System.out.println("Do you want to enter left of " + node.val);
//        boolean left = scanner.nextBoolean();
//        if (left) {
//            System.out.println("Enter the val of the left of " + node.val);
//            int val = scanner.nextInt();
//            node.left = new Node();
//            populate(scanner, node.left);
//        }
//
//        System.out.println("Do you want to enter right of " + node.val);
//        boolean right = scanner.nextBoolean();
//        if (right) {
//            System.out.println("Enter the val of the right of " + node.val);
//            int val = scanner.nextInt();
//            node.right = new Node(val);
//            populate(scanner, node.right);
//        }
//
//    }
//
//    public void display() {
//        display(this.root, "");
//    }
//
//    private void display(Node node, String indent) {
//        if (node == null) {
//            return;
//        }
//        System.out.println(indent + node.val);
//        display(node.left, indent + "\t");
//        display(node.right, indent + "\t");
//    }
//
//    public void prettyDisplay() {
//        prettyDisplay(root, 0);
//    }
//
//    private void prettyDisplay(Node node, int level) {
//        if (node == null) {
//            return;
//        }
//
//        prettyDisplay(node.right, level + 1);
//
//        if (level != 0) {
//            for (int i = 0; i < level - 1; i++) {
//                System.out.print("|\t\t");
//            }
//            System.out.println("|------->" + node.val);
//        } else {
//            System.out.println(node.val);
//        }
//        prettyDisplay(node.left, level + 1);
//    }
//}