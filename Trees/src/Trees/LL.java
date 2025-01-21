package LinkedList;
public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    // function to insert first val in Linked list.
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head; // first item is being added in list.
        }
        size += 1;
    }

    // insert at nth index in Linked list.
    public void insert(int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        } if (index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // insert last val in Linked list.
    public void insertLast(int val){
        if(tail == null ){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // deleteFirst element
    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }

    //delete last item
    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    // Getter function
    public Node get(int index){
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // delete nth element using index
    public int delete(int index){
        if (index == 0){
           return deleteFirst();

        }
        if (index == size-1){
            return deleteLast();
        }
        Node prev = get(index);
        int val = prev.next.val;
            prev.next = prev.next.next;
        return val;
    }

    // length of list
    public int length(LL.Node list){
        int c =0;
        while(list != null){
            c++;
            list = list.next;
        }
        return c;
    }

//   // delete function by val
//   public void deleteByValue(int val){
//       Node temp = find(val);
//
//  

//    merge two list
// Question: Merge two list
public Node mergeTwoLists(LL lista, LL listb) { // this code will not be able to handle edge cases.
    Node list1 = lista.head;
    Node list2 = listb.head;
    Node l1;
    Node l2 ;
    Node t;
    Node ans;
    if(list1.val < list2.val && list1 != null){
        l1 = list1;
        l2 = list2;
    }else{
        l2 = list1;
        l1 = list2;
    }
    ans = l1;
    while(l1 != null && l2 != null){
        if(l1.val <= l2.val && l2.val < l1.next.val){
            l1.next = l2;
            t = l2.next;
            l2.next = l1.next;
            l2 = t;
        }
        l1 = l1.next;
    }
    return ans;
}

    // find function to find val.
    public Node find(int val){
        Node node = head;
        while( node != null){
            if(val == node.val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // Print operation (use temporary head node)
    public void output(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static class Node {
        public int val;
        public Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
        public Node(){
            this.val = -1;
            this.next = null;
        }
    }
}

