import java.util.*;
 class prblm1021RemoveOutermost {
    public static void main(String[] args) {
        String str = "()()";
        System.out.println(removeOuterParenthese(str));
        System.out.println(optimiseOuterParentheses(str));
    }
    public static String removeOuterParenthese(String s) {
        int i = -1;
        char[] c = s.toCharArray();
        Stack<Character> ans = new Stack<Character>();
        Stack<Character> delete = new Stack<Character>();
        for(char a : c){
            if(i<0 && a == '('){
                delete.push(a);
                i++;
            }
            else if(i>=0 && a == '('){
                ans.push(a);
                i++;
            }
            else if( i>0 && a == ')'){
                ans.push(a);
                i--;
            }
            else if( i==0 && a == ')'){
                delete.push(a);
                i--;
            }
        }
        StringBuilder result = new StringBuilder();
        for(char a : ans){
            result.append(a);
        }
        return result.toString();
    }
    public static String optimiseOuterParentheses(String s) {
        int i = -1;
        char[] c = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        for(char a : c){
            if(i<0 && a == '('){
                i++;
            }
            else if(i>=0 && a == '('){
                ans.append(a);
                i++;
            }
            else if( i>0 && a == ')'){
                ans.append(a);
                i--;
            }
            else if( i==0 && a == ')'){
                i--;
            }
        }
        return ans.toString();
    }
}
