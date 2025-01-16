package medium;
import java.util.*;
public class prblm735 {
    public static void main(String[] args) {
        int[] a = {-2,-2,1,-2};
        System.out.println(Arrays.toString(asteroidCollision(a)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<Integer>();
        for (int a : asteroids) {
            boolean dest = false;
            while (!s.isEmpty() && s.peek() > 0 && a < 0) {
                if (Math.abs(a) == s.peek()) {
                    s.pop();
                    dest = true;
                    break;
                } else if (Math.abs(a) > s.peek()) {
                    s.pop();
                } else {
                    dest = true;
                    break;
                }
            }
            if (!dest) {
                s.push(a);
            }
        }
            int[] ans = new int[s.size()];
            if (ans.length == 0) {
                return ans;
            } else {
                for (int i = ans.length - 1; i >= 0; i--) {
                    int j = s.pop();
                    ans[i] = j;
                }
                return ans;
            }
        }

}
