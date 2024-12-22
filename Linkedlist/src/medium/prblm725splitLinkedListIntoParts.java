package medium;

@SuppressWarnings("ReassignedVariable")
public class prblm725splitLinkedListIntoParts {
    public static void main(String[] args) {
        LL.Node f = new LL.Node(6, null);
        LL.Node e = new LL.Node(5, f);
        LL.Node d = new LL.Node(4, e);
        LL.Node c = new LL.Node(3, d);
        LL.Node b = new LL.Node(2, c);
        LL.Node a = new LL.Node(1, b);

        int k = 2;
        LL.Node[] ans = splitLinkedList(a, k);
        for (int i = 0; i <= ans.length; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(ans[j].val + "->");
                ans[j] = ans[j].next;
            }
            System.out.println(" | ");
        }
    }

    public static LL.Node[] splitLinkedList(LL.Node head, int k){
        if(head == null || k == 0){
            return null;
        }
        int n = 0;
        LL.Node temp = head;
        LL.Node t = head;
        LL.Node p = head.next;
        while(temp != null){
            temp = temp.next;
            n++;
        }
        LL.Node[] ans = new LL.Node[n/k];
        int c = k;
        ans[0] = t;
        int m = (n/k)+(n%k);
        while(m>1){
            t.next = p;
            p = p.next;
            m--;
        }
        t.next = null;
        t = p;
        for (int i=1;i<n/c;i++){
            k = n/c;
            ans[i] = t;
            while(k>=1){
                t.next = p;
                p = p.next;
                k--;
            }
            t.next = null;
            t = p;
        }
        return ans;
    }
}
