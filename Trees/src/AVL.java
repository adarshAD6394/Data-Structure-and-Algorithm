class AVL {

    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public AVL() {
    }

    public int height(){
        return height(root);
    }

    private int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(value, root);
    }

    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value, node.left);
        }
        if(value > node.value){
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right))+1;
        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            if(height(node.left.left)-height(node.left.right) > 0){
                return rightRotate(node);
            }
            else if(height(node.left.left)-height(node.left.right) <0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        } else if (height(node.right)-height(node.left)>1) {
            if(height(node.right.right)-height(node.right.left)>0){
                return leftRotate(node);
            }
            else if(height(node.right.right)-height(node.right.left)<0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    public Node rightRotate(Node p){
        Node c = p.left;
        p.left = c.right;
        c.right = p;

        p.height = Math.max(height(p.left), height(p.right)+1);
        c.height = Math.max(height(c.left), height(c.right)+1);

        return c;
    }

    public Node leftRotate(Node p) {
        Node c = p.right;
        p.right = c.left;
        c.left = p;
// error can occur due to above swapping better copy the KK code.

        p.height = Math.max(height(p.left), height(p.right)+1);
        c.height = Math.max(height(c.left), height(c.right)+1);

        return c;
    }
    public void populate(int[] nums){
        for (int i = 0; i <nums.length ; i++) {
            this.insert(nums[i]);
        }
    }

    public void populatedSorted(int[] nums){
          populatedSorted(nums, 0, nums.length);
    }

    private void populatedSorted(int nums[], int start, int end){
        if(start >= end){
            return;
        }
        int mid = (start+end) / 2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid+1, end);
    }

    public void display(){
        display(this.root, "Root Node: ");
    }

    public void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println( details+ node.value);
        display(node.left, "left child of"+ node.getValue() + ":");
        display(node.right, "right child of"+ node.getValue() + ":");
    }

}
