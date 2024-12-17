package medium;

public class RotateRight {
    public static void main(String[] args) {
        LL.Node e = new LL.Node(5, null);
        LL.Node d = new LL.Node(4, e);
        LL.Node c = new LL.Node(3, d);
        LL.Node b = new LL.Node(2, c);
        LL.Node a = new LL.Node(1, b);

        LL.Node ans = rotateRight(a, 2);
        for (int i = 0; i <= 4; i++) {
            System.out.print(ans.val + "->");
            ans = ans.next;
        }
    }
    static LL.Node rotateRight(LL.Node head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        LL.Node n = head;
        int l = 1;
        while(n.next != null){
            l++;
            n = n.next;
        }
        n.next = head;
        if(k<l){
            k = l-k;
            return rotate(head, n, k);
        }else{
            k = l-(k%l);
            return rotate(head, n, k);
        }
    }
    static LL.Node rotate(LL.Node head, LL.Node t, int k){
        for(int i=1;i<=k;i++){
            head = head.next;
            t = t.next;
        }
        t.next = null;
        return head;
    }
}
