import java.util.*;
public class prblm1047RemoveDup {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));

    }
    public static String removeDuplicates(String s) {
        Stack<Character> ans = new Stack<>();
        char[] c = s.toCharArray();
        for(char a : c){
            if(ans.isEmpty() || ans.peek() != a){
                ans.push(a);
            }else {
                ans.pop();
            }
        }
        StringBuilder result = new StringBuilder();
        for(char a : ans){
            result.append(a);
        }
        return result.toString();
    }
}
