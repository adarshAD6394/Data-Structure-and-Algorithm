package Easy;
import java.util.*;
import java.util.Scanner;

public class prblm1624LargestSubstringBetweenTwoEqualCharacters {
    public static void main (String args[]){

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println("ANS : "+ LargestSubstringBetweenTwoEqualCharacters(str));
    }

    public static int LargestSubstringBetweenTwoEqualCharacters (String s) {
        HashMap <Character, Integer> m = new HashMap<>();
        int ans = 0;
        int diff = 0;
        for(int i = 1; i <= s.length();i++){
            if(!m.containsKey(s.charAt(i-1))) {
                m.put(s.charAt(i-1), i);
            }else {
                diff = i-m.get(s.charAt(i-1));
                ans = Math.max(diff,ans);
            }
        }
        return ans-1;
    }

}
