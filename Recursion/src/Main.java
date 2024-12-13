import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] n = {5,6,7,9,8,5,2,1} ;
        System.out.println(Arrays.toString(selectionSort(n, n.length, 0)));
//        rightTriangle(6, 0);
//            leftinverseTriangle(6, 0);
//        System.out.println(product(0));
//        System.out.println(sum(10));
//        print(10);
//        int[] n = {2, 3, 5, 9, 10, 15, 17, 18, 26, 29, 35};
//        int tar = 18;
//        System.out.println(binary(n, tar, 0, n.length - 1));
    }

    static int[] mergeSort(int[] n, int i, int l){
        if(l == 1){
            return n;
        }
        if (i < l){
            int mid = (i+l)/2;
            mergeSort(n , i, mid);
            mergeSort(n , mid+1, l);
            merge(i,mid,l;
        }
    }

    static int[] merge(int[],)

//    static int[] selectionSort(int[] n, int len, int count){
//        if(len == 0){
//            return n;
//        }
//        int maxIndex = maxIndex(n, len);
//        if(count < n.length){
//            int temp = n[len-1];
//            n[len-1] = n[maxIndex];
//            n[maxIndex] = temp;
//            selectionSort(n, len-1, count+1);
//        }
//        return n;
//    }
//
//    static int maxIndex(int[] n, int l){
//        int max = 0;
//        for(int i = 0; i<l; i++){
//            max = (n[i]>n[max])?i:max;
//        }
//        return max;
//    }
//
//    static int[] bubbleSort(int[] n, int i, int j){
//        boolean swap = false;
//        if(i == 0){
//            return n;
//        }
//        if(j<i){
//            if( n[j] > n[j+1] ){
//                int temp = n[j+1];
//                n[j+1] = n[j];
//                n[j] = temp;
//                swap = true;
//                bubbleSort(n, i, j+1);
//            }
//            if(!swap){
//                return n;
//            }
//        }else{
//               bubbleSort(n, i-1, 0);
//        }
//        return n;
//    }
//
//    static void rightTriangle(int r, int c){
//        if(  r == 0) {
//            return;
//        }
//        if(c<r){
//            rightTriangle(r, c+1);
//            System.out.print("*");
//        }else{
//            rightTriangle(r-1,0);
//            System.out.println();
//        }
//    }
//    public static void leftinverseTriangle(int r, int c){
//        if( r == 0){
//            return ;
//        }
//        if(c < r){
//            System.out.print("*");
//            leftinverseTriangle( r , c+1 );
//        }else {
//            System.out.println();
//            leftinverseTriangle(r-1, 0 );
//        }
//    }
//
//    public static void message() {
//        // fibonacci number
//        System.out.println(fibo(30));
//    }
//
//    static int fibo(int n) {
//        if (n < 2) {
//            return n;
//        }
//        return fibo(n - 1) + fibo(n - 2);
//    }
////    recursion base condition
////    recurrence relation fibo(n) = fibo(n-1) + fibo (n-2)
//
//
//    /*Types of Recurrence relation
//    1.) Linear like fibonacci. (subtracted linearly )
//    2.) Divide and Conquer recurrence relation. Like Binary Search. ( Divide by a factor )
//    3.) Dynamic programming will reduce the computation since, fibo(2) is computed twice in tree, it will not be computed ( DP+Recursion ).
//    */
//
//    public static int binary(int[] n, int tar, int s, int e) {
//        if (s > e) {
//            return -1;
//        }
//        int m = s + (e - s) / 2;
//        if (n[m] == tar) {
//            return m;
//        }
//        if (n[m] < tar) {
//            return binary(n, tar, m + 1, e);
//        } else {
//            return binary(n, tar, s, m - 1);
//        }
//    }
//    static void print(int n){
//        System.out.print(n+", ");
//        if(n ==1){
//            return;
//        }
//        print(n-1);
//    }
//
//    static int sum(int n){
//
//        if(n <= 1){
//            return 1;
//        }
//        return n+sum(n-1);
//    }
//    static int  product(int n){
//        if(n <= 1){
//            return 1;
//        }
//        return n*product(n-1);
//    }
//    static int sumOfDigits(int n){
//        if(n == 0) {
//            return 0;
//        }
//        return (n%10)+sumOfDigits(n/10) ;
//    }
}