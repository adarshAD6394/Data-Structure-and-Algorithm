package Easy;
import java.util.*;

public class prblm1332RemovePalindromicSubsequences {
    public static void main (String args[]){

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println("ANS : "+ removePalindromesequence(str));
    }

    public static int removePalindromesequence (String str) {
        if (str.length() == 0) {
            return 0;
        }
        int left = 0;
        int right = str.length()-1;
        while (left<right){
            if(str.charAt(left) != str.charAt(right)){
                return 2;
            }
            left++;
            right--;
        }
        return 1;
    }
}
