public class Concept {

//        Reverse a number
    static int reverse(int n, int rev){
        if(n == 0){
            return rev;
        }
        rev = rev*10+n%10;
        return reverse(n/10, rev);
    }
}

