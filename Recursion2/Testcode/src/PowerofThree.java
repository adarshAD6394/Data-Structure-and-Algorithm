public class PowerofThree {
    public static void main(String[] args) {
        int n = 243;
        System.out.println(three(n));
    }
    public static boolean three(int n){
        if( n<=0 ) {
           return false;
        }
        if(n==1){
            return true;
        }
        else{
            n = n/3;
           return three(n);
        }
    }
}
