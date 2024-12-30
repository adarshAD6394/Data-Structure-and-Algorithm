import java.util.Scanner;
import java.util.Stack;

public class prblm20ValidParentheses {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the string");
//        String str = s.nextLine();
        String str = "[()]";
        System.out.println(validParenthese(str));
    }
    static boolean validParenthese(String s){
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i = 0; i<n;i++){
            char a = s.charAt(i);
            if(a == '(' || a == '{' || a == '['){
                stack.push(a);
            }else if(stack.isEmpty()){
                return false;
            }
            else if(a == ')' || a == '}' || a == ']'){
                if( a == ')' && stack.peek() == '(') {
                    stack.pop();
                }
                else if( a == '}' && stack.peek() == '{') {
                    stack.pop();
                }
                else if( a == ']' && stack.peek() == '[') {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}

