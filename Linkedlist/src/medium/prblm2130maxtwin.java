package medium;

public class prblm2130maxtwin {
    public static void main(String[] args) {
        LL.Node j = new LL.Node(2, null);
        LL.Node i = new LL.Node(6, j);
        LL.Node h = new LL.Node(15, i);
        LL.Node g = new LL.Node(4, h);
        LL.Node f = new LL.Node(6, g);
        LL.Node e = new LL.Node(5, f);
        LL.Node d = new LL.Node(4, e);
        LL.Node c = new LL.Node(3, d);
        LL.Node b = new LL.Node(2, c);
        LL.Node a = new LL.Node(1, b);


        int ans = pairSum(a);
//        for (int p = 0; p <10; p++) {
            System.out.print(ans);
//            ans = ans.next;
    }

    public static int pairSum(LL.Node head) {
        if (head == null || head.next == null) {
            return -1;
        }
        if (head.next.next == null) {
            return head.val + head.next.val;
        }
        LL.Node slow = head;
        LL.Node fast = head;
        while (fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = slow.next;
        slow.next = null;
        LL.Node prev = head;
        LL.Node curr = head.next;
        LL.Node next = curr.next;
        prev.next = null;
        while (next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        prev = curr;
        slow = prev;
        int max = 0;
        while (slow != null && fast != null) {
            max = Math.max(max, (slow.val + fast.val));
            slow = slow.next;
            fast = fast.next;
        }
        return max;
    }
}

