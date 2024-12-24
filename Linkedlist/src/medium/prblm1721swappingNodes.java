package medium;

public class prblm1721swappingNodes {
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

        int k = 3;
        LL.Node ans = swapNodes(a ,k);
        for (int p = 0; p <10; p++) {
            System.out.print(ans.val + "->");
            ans = ans.next;
        }
    }
    public static LL.Node swapNodes(LL.Node head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        LL.Node left = head;
        LL.Node right = head;
        LL.Node curr = head;
        int c = 1;
        while(curr != null){
            if(c<k){
                left = left.next;
            }
            if(c>k){
                right = right.next;
            }
            curr = curr.next;
            c++;
        }
        int t = right.val;
        right.val = left.val;
        left.val = t;
        return head;
    }
        
}
