package medium;

import java.util.*;

public class prblm402RemoveKDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String nums = s.nextLine();
        System.out.println("Enter the Digits to removed");
        int k = s.nextInt();
        System.out.println(optimise(nums, k));
    }
//    public static String removeKdigits(String nums, int k){
//        Stack<Character> s = new Stack<>();
//        for(char a:nums.toCharArray()){
//            while(k>0 && !s.isEmpty() && s.peek()>a){
//                k--;
//                s.pop();
//            }
//            s.push(a);
//        }
//        while(k>0){
//            s.pop();
//            k--;
//        }
//        StringBuilder ans = new StringBuilder();
//        while(!s.isEmpty()){
//            char a = s.pop();
//            if(s.isEmpty() && a == '0' ) continue;
//           ans.append(a);
//        }
//        return ans.reverse().toString();
//    }
    public static String optimise(String nums, int k) {
        if (k >= nums.length()) {
            return "0";
        }
        char[] ans = new char[nums.length()];
        int pos = -1;
        int r = k;
        for (char a : nums.toCharArray()) {
            if (pos < 0) {
                pos++;
                ans[pos] = a;
            }
            else if (ans[pos] <= a && k>0) {
                pos++;
                ans[pos] = a;
            }
            else if (ans[pos] > a && k > 0) {
                while (pos>=0 && ans[pos] > a && k > 0) {
                    ans[pos] = a;
                    pos--;
                    k--;
                }
                pos++;
            }else if ( k <= 0) {
                pos++;
                ans[pos] = a;
            }
        }
        int s = 0;
        int e = nums.length()-r;
        while (ans[s] == '0' && s < e - 1) {
            s++;
        }
        return String.valueOf(ans, s, e-s);
    }
}
