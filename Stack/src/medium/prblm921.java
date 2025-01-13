package medium;

import java.util.*;
public class prblm921 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = s.nextLine();
        System.out.println(minAddToMakeValid(str));

    }
    public static int minAddToMakeValid(String s) {
        char[] c = s.toCharArray();
        Stack<Character> str = new Stack<Character>();
        int i = 0;
        for(char a : c){
            if(a == ')'){
                if(!str.isEmpty() && str.peek() == '(' ){
                    str.pop();
                    i--;
                }else{
                    str.push(a);
                    i++;
                }

            }else if(a == '('){
                str.push(a);
                i++;
            }
        }
        return (int)Math.abs(i);
    }

    static int optimise(String str){
        int open = 0;
        int close = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                open++;
            }
            if(c == ')'){
                if(open == 0){
                    close++;
                }
                else{
                    open--;
                }
            }
        }
        return open+close;
    }
}
