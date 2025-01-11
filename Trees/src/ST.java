public class ST {
    public static class Node {
        private int value;
        private int start;
        private int end;
        private Node left;
        private Node right;

        public Node(int startInterval, int endInterval) {
            this.value = value;
            this.start = startInterval;
            this.end = endInterval;
        }

    }

    public Node root;

    public ST(){};

    public ST(int[] arr){
        // create a tree using method constructTree
        this.root = constructTree(arr, 0 , arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end){
        if(start == end){
            Node leaf = new Node(start, end);
            leaf.value = arr[start];
            return leaf;
        }
        // create a new node with index you are at
        Node node = new Node(start, end);
        int mid = (start+end)/2;

        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid+1, end);

        node.value = node.left.value + node.right.value;
        return node;
    }

//    display
    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str = "";

        if(node.left != null){
            str = str+"Interval=["+node.left.start+ "-" +node.left.end+ "] value =>" + node.left.value + " ";
        }else{
            str = str + "No left child";
        }

//        current node

        if(node.right != null){
            str = str+"Interval=["+node.right.start+ "-" +node.right.end+ "] value =>" + node.right.value + " ";
        }else{
            str = str + "No right child";
        }

        System.out.println(str);
        if(node.left != null){
            display(node.left);
        }
        if(node.right != null){
            display(node.right);
        }
    }

//    query
    public int query(int qsi, int qei){
        return this.query(this.root, qsi, qei);
    }
    private int query(Node node, int qsi, int qei) {
        if (node.start >= qsi && node.end <= qei) {
            return node.value;
        } else if (node.start > qei || node.end < qsi) {
            return 0;
        } else {
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

//        update

    public void update(int index, int newValue){
        this.root.value = update(this.root, index, newValue);
    }

    private int update(Node node, int index, int newValue){
        if (index >= node.start && index<node.end) {
            if(index == node.start && index == node.end){
                node.value = newValue;
                return node.value;
            }else{
                int leftAns = update(node.left, index, newValue);
                int rightAns = update(node.right, index, newValue);

                node.value = leftAns + rightAns;
                return node.value;
            }
        }
        return node.value;
    }

}
