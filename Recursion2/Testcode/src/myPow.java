public class myPow {
    public static void main(String[] args) {
        double x = 2.0;
        int n = -2147483647;
        double ans = 1.0000;
        if(x == 0 || x==1 || x==-1){
            if(n%2 == 0){
                System.out.println(x);
            }else {
                System.out.println(x);
            }
        } else if (n>0) {
            ans = myPow(x, n, ans);
            System.out.println(ans);
        } else if (n<0){
            n = Math.abs(n);
           ans = 1/myPow(x, n, ans);
            System.out.println(ans);
        }

    }
    static double myPow(double x, long n, double ans){
        if(n == 0){
            return 1;
        }
        if(n<=1){
            return ans*x;
        }
        if(ans == 0 ){
            return ans;
        }
        else{
            ans = ans*x;
            return myPow(x, n-1, ans);
        }
    }
}
