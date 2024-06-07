

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        rightinverseTriangle(6, 0);
//            leftinverseTriangle(6, 0);
//        System.out.println(product(0));
//        System.out.println(sum(10));
//        print(10);
//        int[] n = {2, 3, 5, 9, 10, 15, 17, 18, 26, 29, 35};
//        int tar = 18;
//        System.out.println(binary(n, tar, 0, n.length - 1));
    }

    static void rightinverseTriangle(int r, int c){
        if(  r == 0) {
            return;
        }
        if(c<r){
            rightinverseTriangle(r, c+1);
            System.out.print("*");
        }else{
            rightinverseTriangle(r-1,0);
            System.out.println();
        }
    }
//    public static void leftinverseTriangle(int r, int c){
//        if( r == 0){
//            return ;
//        }
//        if(c < r){
//            System.out.print("*");
//            leftinverseTriangle( r , c+1 );
//        }else {
//            System.out.println();
//            inverseTriangle(r-1, 0 );
//        }
//    }

//    public static void message() {
//        // fibonacci number
//        System.out.println(fibo(30));
//    }

//    static int fibo(int n) {
//        if (n < 2) {
//            return n;
//        }
//        return fibo(n - 1) + fibo(n - 2);
//    }
//    recursion base condition
//    recurrence relation fibo(n) = fibo(n-1) + fibo (n-2)


    /*Types of Recurrence relation
    1.) Linear like fibonacci. (subtracted linearly )
    2.) Divide and Conquer recurrence relation. Like Binary Search. ( Divide by a factor )
    3.) Dynamic programming will reduce the computation since, fibo(2) is computed twice in tree, it will not be computed ( DP+Recursion ).
    */

    public static int binary(int[] n, int tar, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (n[m] == tar) {
            return m;
        }
        if (n[m] < tar) {
            return binary(n, tar, m + 1, e);
        } else {
            return binary(n, tar, s, m - 1);
        }
    }
    static void print(int n){
        System.out.print(n+", ");
        if(n ==1){
            return;
        }
        print(n-1);
    }

    static int sum(int n){

        if(n <= 1){
            return 1;
        }
        return n+sum(n-1);
    }
    static int  product(int n){
        if(n <= 1){
            return 1;
        }
        return n*product(n-1);
    }
    static int sumOfDigits(int n){
        if(n == 0) {
            return 0;
        }
        return (n%10)+sumOfDigits(n/10) ;
    }
}