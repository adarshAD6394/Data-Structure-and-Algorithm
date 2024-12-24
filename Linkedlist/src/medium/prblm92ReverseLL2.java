package medium;

public class prblm92ReverseLL2 {
    public static void main(String[] args) {
        LL.Node j = new LL.Node(10, null);
        LL.Node i = new LL.Node(9, j);
        LL.Node h = new LL.Node(8, i);
        LL.Node g = new LL.Node(7, h);
        LL.Node f = new LL.Node(6, g);
        LL.Node e = new LL.Node(5, f);
        LL.Node d = new LL.Node(4, e);
        LL.Node c = new LL.Node(3, d);
        LL.Node b = new LL.Node(2, c);
        LL.Node a = new LL.Node(1, b);

        int left = 2;
        int right = 8;
        LL.Node ans = reverseBetween(a, left, right);
        for (int p = 0; p <10; p++) {
            System.out.print(ans.val + "->");
            ans = ans.next;
        }
    }
    public static LL.Node reverseBetween(LL.Node head, int left, int right) {
        if(head == null || head.next == null && right-left == 0){
            return head;
        }
        LL.Node l = head;
        LL.Node r = head;
        LL.Node b = head;
        int c = right-left;
        while(right>1){
            r = r.next;
            if(left>1){
                l = l.next;
                left--;
            }
            if(left>0){
                b = b.next;
            }
            right--;
        }
        LL.Node f = r.next;
        r.next = l;
        LL.Node t = l.next;
        for(int i=0;i<=c;i++){
            l.next = r;
            r = l;
            l = t;
            t = t.next;
        }
        l.next =  f;
        b.next = r;
        return head;
    }
}
