package Easy;
import java.util.*;

public class prblm1903LargestOddNumberinString {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println("output is :"+LargestOddNumberinString(str));
    }

    static String LargestOddNumberinString(String num){
        for (int i = num.length()-1; i >= 0;i--){
            if ((num.charAt(i) - '0')%2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
