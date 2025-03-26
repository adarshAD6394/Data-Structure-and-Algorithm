package medium;

import java.util.*;

public class Prblm215KthLargest {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums){
            heap.add(i);
        }
        for(int i = 0;i<k-1;i++){
            heap.poll();
        }

        return (int) heap.peek();
    }
}
