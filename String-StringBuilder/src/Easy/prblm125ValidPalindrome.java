package Easy;

import java.util.Scanner;

public class prblm125ValidPalindrome {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(str);
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

