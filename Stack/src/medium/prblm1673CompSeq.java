package medium;
import java.util.*;

public class prblm1673CompSeq {
    public static void main(String[] args) {
        int[] a = {2,3,4,5,0,1,2};
        int k = 4;
        System.out.println(Arrays.toString(mostCompetitive(a, k)));
    }
    public static int[] mostCompetitive(int[] nums, int k){
        Stack<Integer> s = new Stack<>();
        int[] n = new int[k];
        for(int a:nums) {
            while (!s.isEmpty() && s.peek() > a) {
                s.pop();
            }
            s.push(a);
        }
        int i = 0;
        for (int a: s){
             if(i<k){
                 n[i] = a;
                 i++;
             }
        }
        return n;
    }
}
