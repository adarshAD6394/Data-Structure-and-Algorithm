public class MiddleofLL {
    public static void main(String[] args) {
        LL.Node e = new LL.Node(5, null);
        LL.Node d = new LL.Node(4, e);
        LL.Node c = new LL.Node(3, d);
        LL.Node b = new LL.Node(2, c);
        LL.Node a = new LL.Node(1, b);
        int count = 1;
        LL.Node t = a;
        while(t.next != null){
            count++;
            t = t.next;
        }
        LL.Node ans = a;
        ans = middleofList(a,count);
        if(count % 2 == 0){
            count = (count/2)+1;
        }else{
            count = (count+1)/2;
        }
        for (int i = 0; i <count ; i++) {
            System.out.print(ans.val+"->");
            ans = ans.next;
        }
    }
    static LL.Node middleofList(LL.Node list, int count){
        if(list == null){
            return list;
        }
        if(count % 2 == 0){
            count = (count/2)+1;
            for(int i = 1; i<count; i++){
                list = list.next;
            }
            return list;
        }else{
            count = (count+1)/2;
            for(int i = 1; i<count; i++){
                list = list.next;
            }
            return list;
        }
    }
}
