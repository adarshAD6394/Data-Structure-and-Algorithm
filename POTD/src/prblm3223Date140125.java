import java.util.*;
public class prblm3223Date140125 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = s.nextLine();
        System.out.println(minimumLength(str));
    }
    public static int minimumLength(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        int count = c.length;
        for(int i = 0;i<=c.length-3;){
            if(c[i] == c[i+1] && c[i+1]== c[i+2]){
                count -= 2;
                i+=2;
            }else{
                i++;
            }
        }
        return count;
    }
}
