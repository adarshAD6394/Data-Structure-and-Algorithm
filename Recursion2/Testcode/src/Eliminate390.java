import java.util.ArrayList;
import java.util.Arrays;
public class Eliminate390 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(lastRemaining(n));
    }

    public static int lastRemaining(int n) {
        return n<= 1 ? n : 2*(1+n/2-lastRemaining(n/2));
    }
}



//    This code is correct but uses too much of memory for large numbers.
//    public static void main(String[] args) {
//        int n = 10;
//        int count = 1;
//        ArrayList<Integer> k = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            k.add(i);
//        }
//        System.out.println(lastRemain(k, count));
//
//
//    }
//    public static int lastRemain(ArrayList<Integer> k, int c){
//        ArrayList<Integer> a = new ArrayList<>();
//            if(k.size() == 1){
//                return k.getFirst();
//            }
//        else  if(c%2 != 0){
//            if(k.size()%2==0) { // from l to r k.size is even
//                for (int i = 0; i <= (k.size() / 2) - 1; i++) {
//                    a.add(k.get(2 * i + 1));
//                }
//                c++;
//                return lastRemain(a, c);
//            }
//            else{               // from l to r k.size is odd.
//                for (int i = 0; i < k.size() / 2; i++) {
//                    a.add(k.get(2 * i + 1));
//                }
//                c++;
//                return lastRemain(a, c);
//            }
//        }else{
//                int l = k.size();
//                if (k.size() % 2 == 0) { // form r to l even size
//                    for (int i = (k.size() / 2) - 1; i >= 0; i--) {
//                        a.add(k.get(l - 2 * i - 2));
//                    }
//                    c++;
//                    return lastRemain(a, c);
//                } else {
//                    for (int i = (k.size() / 2) - 1; i >= 0; i--) {
//                        a.add(k.get(l - 2 * i - 2));
//                    }
//                    c++;
//                    return lastRemain(a, c);
//                }
//            }
//    }




