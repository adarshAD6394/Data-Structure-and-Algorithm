public class CountGood {
    static long mod = 1000000007;
    public static void main(String[] args) {
        long n = 30;
        long x = (n+1)/2;
        long y = n/2;

        long ans = (count(5, x)%mod * count(4, y)%mod)%mod;
        System.out.println(ans);

    }
    public static int count(long x, long k){
        if(k == 0){
            return 1;
        }
        long temp = count(x, k/2 );
        if(k%2 == 0){
            return (int) ((temp*temp)%mod);
        }else{
            return (int) ((x*temp*temp)%mod);
        }
    }
}
