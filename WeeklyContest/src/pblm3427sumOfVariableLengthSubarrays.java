import java.util.Scanner;

public class pblm3427sumOfVariableLengthSubarrays {
    public static void main(String[] args) {
        int[] a = {2,3,1};
        System.out.println(subarraySum(a));
    }
    public static int subarraySum(int[] nums) {
        int n = nums.length;
        int[] presum = new int[n];
        presum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            presum[i] = presum[i-1] + nums[i];
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            int start = Math.max(0, i - nums[i]);
            if (start == 0) res += presum[i];
            else res += presum[i] - presum[start-1];
        }
        return res;
    }
}
