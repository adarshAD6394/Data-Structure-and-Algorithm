package medium;

public class prblm143ReorderLinkedList {
    public static void main(String[] args) {
//        LL.Node j = new LL.Node(10, null);
        LL.Node i = new LL.Node(9, null);
        LL.Node h = new LL.Node(8, i);
        LL.Node g = new LL.Node(7, h);
        LL.Node f = new LL.Node(6, g);
        LL.Node e = new LL.Node(5, f);
        LL.Node d = new LL.Node(4, e);
        LL.Node c = new LL.Node(3, d);
        LL.Node b = new LL.Node(2, c);
        LL.Node a = new LL.Node(1, b);

        LL.Node ans = reorderList(a);
        for (int p = 0; p<10; p++) {
            System.out.print(ans.val + "->");
            ans = ans.next;
        }
    }
    public static LL.Node reorderList(LL.Node head) {
        if (head == null || head.next == null) {
            return head; // No reordering needed for empty or single-node lists
        }
        LL.Node slow = head;
        LL.Node fast = head;
        while(fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        LL.Node rev = slow.next;
        slow.next = null;
        slow = rev;
        LL.Node prev = null;
        while(rev != null){
            rev = rev.next;
            slow.next = prev;
            prev = slow;
            slow = rev;
        }
        slow = prev;
        fast = head;
        while(slow!= null){
            LL.Node temp1 = fast.next;
            LL.Node temp2 = slow.next;
            fast.next = slow;
            slow.next = temp1;
            fast = temp1;
            slow = temp2;
        }
        return head;
    }
}
