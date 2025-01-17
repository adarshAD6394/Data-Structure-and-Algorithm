package medium;
import java.util.*;

public class prblm456132Pattern {
    public static void main(String[] args) {
        int[] c = {3,5,0,3,4};
        System.out.println(find132pattern(c));
    }
//    public static boolean find132pattern(int[] nums) {
//        Stack<Integer> s = new Stack<>();
//        boolean ans = false;
//        for(int a : nums){
//            if(s.size()==2){
//                if(a>s.peek()){
//                    s.pop();
//                    s.push(a);
//                }else if(a<s.peek()){
//                    int t = s.pop();
//                    if(a>s.peek()){
//                        s.push(t);
//                        s.push(a);
//                        ans = true;
//                        break;
//                    }else{
//                        s.pop();
//                        s.push(a);
//                    }
//                }
//
//            } else if (s.size()<2) {
//                if(s.isEmpty()){
//                    s.push(a);
//                }else if(!s.isEmpty() && a > s.peek()){
//                    s.push(a);
//                }else if(!s.isEmpty() && a < s.peek()){
//                    s.pop();
//                    s.push(a);
//                }
//            }
//        }
//        return ans;
//    } Everything is right failing for test case {3,5,0,3,4}.
//    Can be tackled using array of stack to store possible combination like 3,5 and 0,4 and check for later digits.
    public static boolean find132pattern(int[] nums) {
        Stack <Integer> stack = new Stack ();
        int second = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums [i] < second)
                return true;
            while (!stack.isEmpty() && nums [i] > stack.peek ())
                second = stack.pop ();
            stack.push (nums [i]);
        }
        return false;
    }
}
