package medium;
import java.util.*;

import static java.lang.Double.compare;

public class prblm973KClose {
    public static void main(String[] args) {
        int[][] n = {{3,3},{-2,4},{5,-1}};
        int k = 1;
        System.out.println(Arrays.deepToString(kClosest(n, k)));
    }
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> distance = new PriorityQueue<>((a,b) -> Double.compare(Math.sqrt(b[0]*b[0]+b[1]*b[1]), Math.sqrt(a[0]*a[0]+a[1]*a[1])));
        for(int[] p : points){
            distance.offer(p);
            if(distance.size()>k){
                distance.poll();
            }
        }
        int[][] ans = new int[k][2];
        while(!distance.isEmpty()){
            ans[--k] = distance.poll();
        }
        return ans;
    }
}
