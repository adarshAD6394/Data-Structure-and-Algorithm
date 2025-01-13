package medium;
import java.util.*;
public class prblm735 {
    public static void main(String[] args) {
    int[] a = {-8,5,3,-8};
    System.out.println(Arrays.toString(asteroidCollision(a)));
    }
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<Integer>();
        for(int a : asteroids){
            if(!s.isEmpty() && s.peek()<0 && a<0){
                s.push(a);
            }
            else if(!s.isEmpty() && a<0){
                int i = a;
                while(!s.isEmpty() && a<0 && Math.abs(a)>=s.peek()){
                    s.pop();
                }
                s.push(i);
            }else{
                s.push(a);
            }
        }
        int[] ans = new int[s.size()];
        if(ans.length == 0){
            return ans;
        }else {
            for (int i = ans.length - 1; i >= 0; i--) {
                int j = s.pop();
                ans[i] = j;
            }
            return ans;
        }
    }
}
