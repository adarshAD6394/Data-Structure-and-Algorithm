package Easy;
import java.io.*;
import java.util.*;

public class prblm205IsomorphicStrings {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        System.out.println("output : "+isomorphicStrings(s,t));
    }
    static boolean isomorphicStrings(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] arr = new int[128];
        int[] brr = new int[128];
        for(int i = 0;i<s.length();i++){
            if(arr[s.charAt(i)] != brr[t.charAt(i)]){
                return false;
            }
            brr[t.charAt(i)] = i+1;
            arr[s.charAt(i)] = i+1;
        }
        return true;
    }
}
