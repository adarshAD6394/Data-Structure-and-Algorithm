import java.util.Scanner;
import java.util.Stack;

public class prblm20ValidParentheses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = s.nextLine();

        System.out.println(validParenthese(str));
    }
    static boolean validParenthese(String s){
//        Stack<Character> stack = new Stack<>();
//        int n = s.length();
//        for(int i = 0; i<n;i++){
//            char a = s.charAt(i);
//            if(a == '(' || a == '{' || a == '['){
//                stack.push(a);
//            }else if(stack.isEmpty()){
//                return false;
//            }
//            else if(a == ')' || a == '}' || a == ']'){
//                if( a == ')' && stack.peek() == ')') {
//                    stack.pop();
//                }
//                if( a == '}' && stack.peek() == '}') {
//                    stack.pop();
//                }
//                if( a == 'c' && stack.peek() == ')') {
//                    stack.pop();
//                }
//                return false;
//            }
//        }
//        return true;
//    }
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for (char a : s.toCharArray()){
            if (a == '(' ) {
                stack.push(')');
            } else if (a == '{') {
                stack.push('}');
            } else if (a == '[') {
                stack.push(']');
            } else if(stack.isEmpty() || stack.pop() != a ){
                return false;
            }
        }
        return stack.isEmpty();
    }
}

