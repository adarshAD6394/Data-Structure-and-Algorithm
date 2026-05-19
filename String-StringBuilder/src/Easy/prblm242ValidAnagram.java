package Easy;

import java.util.HashMap;
import java.util.Scanner;

public class prblm242ValidAnagram {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(isAnagram(s1, s2));
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        for (char c : s1.toCharArray()){
            h1.merge(c, 1, Integer::sum);
        }
        for (char c : s2.toCharArray()){
            h2.merge(c, 1, Integer::sum);
        }
        return h1.equals(h2);
    }
}
