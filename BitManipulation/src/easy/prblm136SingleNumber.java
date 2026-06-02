package easy;
import java.util.*;

public class prblm136SingleNumber {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String[] str = s.nextLine().split(",");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println("output is: "+SingleNumber(arr));
    }
    static int SingleNumber(int[] n){
        int ans = 0;
        for (int i = 0;i<n.length;i++){
            ans ^= n[i];
        }
        return ans;
    }
}
