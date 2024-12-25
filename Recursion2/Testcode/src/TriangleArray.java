import java.util.ArrayList;
import java.util.Arrays;

public class TriangleArray {
    public static void main(String[] args) {
        int[] n = {2,4,5,6};
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = triangleArray(n, list);
        for(int i:n){
            list.add(i);
        }
        System.out.println(list);
    }
    public static ArrayList<Integer> triangleArray( int[] arr, ArrayList<Integer> list){
       int n = arr.length;
       int[] newArr = new int[n-1];
       for(int i = 0;i<newArr.length;i++){
           newArr[i] = arr[i]+arr[i+1];
       }
       if(newArr.length>1){
           triangleArray(newArr, list);
       }
       for(int j : newArr) {
           list.add(j);
       }
       return list;
    }
}
