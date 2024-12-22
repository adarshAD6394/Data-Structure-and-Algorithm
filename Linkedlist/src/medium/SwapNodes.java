package medium;

public class SwapNodes {
    public static void main(String[] args) {
//        LL.Node f = new LL.Node(6, null);
//        LL.Node e = new LL.Node(5, f);
//        LL.Node d = new LL.Node(4, e);
//        LL.Node c = new LL.Node(3, d);
        LL.Node b = new LL.Node(2, null);
        LL.Node a = new LL.Node(1, b);

        LL.Node ans = swapPairs(a);
        for (int i = 0; i <= 1; i++) {
            System.out.print(ans.val + "->");
            ans = ans.next;
        }
    }
//    static LL.Node swapPairs(LL.Node head) {
//        if(head == null || head.next == null){
//            return head;
//        }
//        if(head.next.next == null){
//            LL.Node t = head.next;
//            head.next = null;
//            t.next = head;
//            return t;
//        }
//        LL.Node t = head;
//        LL.Node b = head;
//        LL.Node f = t.next;
//        int count = 1;
//        head = f;
//        while(t.next != null && t.next.next != null) {
//            t.next = f.next;
//            f.next = t;
//            if(count == 1){
//                count++;
//            }else{
//                b.next = f;
//            }
//            b = t;
//            t = t.next;
//            if(t.next == null){
//                return head;
//            }
//            f = t.next;
//        }
//        if(f.next == null){
//            t.next = f.next;
//            f.next = t;
//            b.next = f;
//            return head;
//        }
//        return head;
//    }

    static LL.Node swapPairs(LL.Node head){
        
        return head;
    }
}
