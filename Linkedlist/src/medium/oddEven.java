package medium;

import java.util.LinkedList;

public class oddEven {
    public static void main(String[] args) {
        LL.Node f = new LL.Node(6, null);
        LL.Node e = new LL.Node(5, f);
        LL.Node d = new LL.Node(4, e);
        LL.Node c = new LL.Node(3, d);
        LL.Node b = new LL.Node(2, c);
        LL.Node a = new LL.Node(1, b);

        LL.Node ans = oddEvenList(a);
        for (int i = 0; i <= 5; i++) {
            System.out.print(ans.val + "->");
            ans = ans.next;
        }
    }
    static LL.Node oddEvenList(LL.Node head) {
        if (head == null || head.next == null) {
            return head; // If the list has 0 or 1 nodes, return as is.
        }

        LL.Node odd = head;
        LL.Node even = head.next;
        LL.Node evenHead = even; // Keep the start of the even list

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;

        return head;
    }
    
}
