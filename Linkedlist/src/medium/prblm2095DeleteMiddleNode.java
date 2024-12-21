package medium;

public class prblm2095DeleteMiddleNode {
    public static void main(String[] args) {
        LL.Node f = new LL.Node(6, null);
        LL.Node e = new LL.Node(5, f);
        LL.Node d = new LL.Node(4, e);
        LL.Node c = new LL.Node(3, d);
        LL.Node b = new LL.Node(2, c);
        LL.Node a = new LL.Node(1, b);

        LL.Node ans = deleteMiddle(a);
        for (int i = 0; i <= 5-1; i++) {
            System.out.print(ans.val + "->");
            ans = ans.next;
        }
    }

   
    public static LL.Node deleteMiddle(LL.Node head) {
        if( head == null || head.next == null){
            return null;
        }
        LL.Node fast = head;
        LL.Node slow = head;
        LL.Node p = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            p = slow;
            slow = slow.next;

        }
        p.next = slow.next;
        return head;
    }
    
}
