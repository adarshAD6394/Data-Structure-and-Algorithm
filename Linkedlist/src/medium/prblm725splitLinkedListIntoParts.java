package medium;

@SuppressWarnings("ReassignedVariable")
public class prblm725splitLinkedListIntoParts {
    public static void main(String[] args) {
//        LL.Node j = new LL.Node(10, null);
//        LL.Node i = new LL.Node(9, j);
//        LL.Node h = new LL.Node(8, i);
//        LL.Node g = new LL.Node(7, h);
//        LL.Node f = new LL.Node(6, g);
        LL.Node e = new LL.Node(5, null);
        LL.Node d = new LL.Node(4, e);
        LL.Node c = new LL.Node(3, d);
        LL.Node b = new LL.Node(2, c);
        LL.Node a = new LL.Node(1, b);

        int k = 3;
        LL.Node[] ans = splitListToParts(a,k);
        System.out.print("[");
        for (LL.Node part : ans) {
            System.out.print("[");
            LL.Node current = part;
            while (current != null) {
                System.out.print(current.val + "->");
                current = current.next;
            }
            System.out.print("]");
        }
        System.out.print("]");
}
    static LL.Node[] splitListToParts(LL.Node head, int k) {
        // Step 1: Count the length of the linked list
        int length = 0;
        LL.Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Step 2: Determine the size of each part
        int baseSize = length / k;
        int extra = length % k;

        // Step 3: Split the list into parts
        LL.Node[] result = new LL.Node[k];
        current = head;

        for (int i = 0; i < k; i++) {
            result[i] = current;
            int partSize = baseSize + (i < extra ? 1 : 0);

            for (int j = 0; j < partSize - 1; j++) {
                if (current != null) {
                    current = current.next;
                }
            }

            // Break the link if needed
            if (current != null) {
                LL.Node nextPart = current.next;
                current.next = null;
                current = nextPart;
            }
        }

        return result;
    }
//    public static LL.Node[] splitLinkedList(LL.Node head, int k){
//        if(head == null){
//            return new LL.Node[k];
//        }
//        int n = 0;
//        LL.Node temp = head;
//        while(temp != null){
//            temp = temp.next;
//            n++;
//        }
//        LL.Node p = head;
//        LL.Node[] ans = new LL.Node[k];
//        int c = n>k?k:n;
//        ans[0] = p;
//        int m = 0;
//        if(n>k){
//            m = (n/k)+n%k;
//            while(m>1){
//                p = p.next;
//                m--;
//            }
//        }
//        else{
//            m = n/k;
//            while(m<0){
//                p = p.next;
//                m++;
//            }
//        }
//        LL.Node next = p.next;
//        p.next = null;
//        p = next;
//        for (int i=1;i<c;i++){
//            k = n/c;
//            ans[i] = p;
//            while(k>1){
//                if(p != null){
//                    p = p.next;
//                }
//                k--;
//            }
//            if (p != null) {
//                next = p.next;
//                p.next = null;
//                p = next;
//            }
//        }
//        return ans;
//    }
}
