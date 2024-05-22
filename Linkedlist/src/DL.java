public class DL {

    private Node head;
    private Node tail;

    private int size;
    public DL(){
        this.size = 0;
    }
    // Insert first
    public void  insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {   // for node being the first element i.e. head is null.
            head.prev = node;
        }
        if(tail == null) {  // this is keeping the track of tail.
            tail = head; // first item is being added in list.
        }
        head = node;
        size++;
    }

    public void insert(int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        } if (index == size-1){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i<index; i++){
            temp = temp.next;
            temp = temp.next.prev;
        }
        Node node = new Node(val, temp.next, temp.prev);
        temp.next = node;
        temp.next.prev = node;
    }


    public void insertLast(int val){
        Node node = new Node(val);
        node.next = null;
        node.prev = tail;
        if(tail != null) {
            tail.next = node;
        }
        tail = node;
        size--;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    // reverse list
    public void revDisplay(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp = temp.prev;
        }
        System.out.println();
    }
    private static class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}