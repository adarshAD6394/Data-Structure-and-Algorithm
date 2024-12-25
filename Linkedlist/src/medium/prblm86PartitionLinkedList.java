package medium;

public class prblm86PartitionLinkedList {
    public static void main(String[] args) {
        LL.Node j = new LL.Node(5, null);
        LL.Node i = new LL.Node(2, j);
        LL.Node h = new LL.Node(8, i);
        LL.Node g = new LL.Node(3, h);
        LL.Node f = new LL.Node(2, g);
        LL.Node e = new LL.Node(5, f);
        LL.Node d = new LL.Node(2, e);
        LL.Node c = new LL.Node(3, d);
        LL.Node b = new LL.Node(4, c);
        LL.Node a = new LL.Node(1, b);

        int left = 2;
        LL.Node ans = partition(a, left);
        for (int p = 0; p <10; p++) {
            System.out.print(ans.val + "->");
            ans = ans.next;
        }
    }
    public static LL.Node partition(LL.Node head, int x) {
        LL.Node s = new LL.Node(0);
        LL.Node l = new LL.Node(0);
        LL.Node ts = s;
        LL.Node tl = l;
        while(head != null){
            if(head.val>x){
                l.next = head;
                head = head.next;
                l = l.next;
                l.next = null;
            }else{
                s.next = head;
                s = s.next;
                head = head.next;
                s.next = null;
            }
        }
        s.next = tl.next;
        return ts.next;
    }
}
