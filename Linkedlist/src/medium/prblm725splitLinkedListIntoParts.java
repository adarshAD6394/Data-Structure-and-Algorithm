package medium;

public class prblm725splitLinkedListIntoParts {
    public static void main(String[] args) {
        LL.Node f = new LL.Node(6, null);
        LL.Node e = new LL.Node(5, f);
        LL.Node d = new LL.Node(4, e);
        LL.Node c = new LL.Node(3, d);
        LL.Node b = new LL.Node(2, c);
        LL.Node a = new LL.Node(1, b);

        int k = 0;
        LL.Node[] ans = splitLinkedList(a, k);
        for (int i = 0; i <= 5; i++) {
            System.out.print(ans[i].val + "->");
            ans[i] = ans[i].next;
        }
    }

    public static LL.Node[] splitLinkedList(LL.Node head, int k){
        int n = 1;
        LL.Node t = head;
        while(t != null){
            t = t.next;
            n++;
        }
        LL.Node[] ans = new LL.Node[n/k];

        return ans;
    }
}
