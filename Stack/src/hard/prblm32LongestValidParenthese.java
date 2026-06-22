package hard;
import java.util.*;
public class prblm32LongestValidParenthese {
    public static void main(String[] args) {
        String s = "";
        System.out.println(longestValidParentheses(s));
    }
    public static int longestValidParentheses(String nums) {
        Stack<Character> s = new Stack<>();
        int count = 0;
        for(char a:nums.toCharArray()){
            while(!s.isEmpty()){
                if(a == ')' && s.peek() == '('){
                    s.pop();
                    count++;
                }else if(a == '('){
                    s.push(a);
                }
            }
            if(s.empty()){
                s.push(a);
            }
        }
        return count;
    }
}
