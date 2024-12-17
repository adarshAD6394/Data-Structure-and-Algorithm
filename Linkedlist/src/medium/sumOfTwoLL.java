package medium;
public class sumOfTwoLL {
    public static void main(String[] args) {
        LL.Node e = new LL.Node(9, null );
        LL.Node d = new LL.Node(9, e);
        LL.Node c = new LL.Node(9, d);
        LL.Node b = new LL.Node(9, c);
        LL.Node a = new LL.Node(9, b);

        LL.Node s = new LL.Node(4, null);
        LL.Node r = new LL.Node(9, s);
        LL.Node q = new LL.Node(9, r);
        LL.Node p = new LL.Node(9, q);

        LL.Node ans = addTwoNumbers(a,p);
        for (int i = 0; i <= 4; i++) {
            System.out.print(ans.val+"->");
            ans = ans.next;
        }
    }
    public static LL.Node addTwoNumbers(LL.Node l1, LL.Node l2) {
        if(l1==null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        LL.Node a = l1;
        LL.Node b = l2;
        LL.Node ans = l1;
        while(a != null && b != null){
            a = a.next;
            b = b.next;
        }
        if(a == null){
            ans = l1;
            l1 = l2;
            l2 = ans;
            ans = l1;
        }
        int sum = 0, q = 0;
        LL.Node e = new LL.Node();
        while(l1 != null && l2 != null){
            sum = q+l1.val+l2.val;
            q = sum/10;
            if(l1.next != null || (sum%10)==0 ){
                l1.val = sum%10;
                l1 = l1.next;
                l2 = l2.next;
            }else{
                l1.next = e;
                e.val = q;
            }
        }
        return ans;
    }
}
