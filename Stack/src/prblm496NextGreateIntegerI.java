import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;
public class prblm496NextGreateIntegerI {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the array length nums1");
//        int n = scanner.nextInt();
//        int[] nums1 = new int[n];
//        System.out.print("Enter the the array 1");
//        for (int i = 0; i < nums1.length; i++) {
//            nums1[i] = scanner.nextInt();
//        }
//        System.out.print("Enter the array length of nums2");
//        int m = scanner.nextInt();
//        int[] nums2 = new int[m];
//        System.out.print("Enter the the array 2");
//        for (int i = 0; i < nums2.length; i++) {
//            nums2[i] = scanner.nextInt();
//        }
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] ans = new int[nums1.length];
        ans = nextGreaterElement(nums1, nums2);

        System.out.print("[");
        for (int i = 0; i <ans.length; i++) {
            System.out.print(ans[i]+",");
        }
        System.out.print("]");
    }
        public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
            Stack<Integer> stack = new Stack<>();
            int[] nextGreater = new int[nums2.length];
            for (int i = nums2.length - 1; i >= 0; i--) {
                int current = nums2[i];
                while (!stack.isEmpty() && stack.peek() <= current) {
                    stack.pop();
                }
                nextGreater[i] = stack.isEmpty() ? -1 : stack.peek();
                stack.push(current);
            }
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j]) {
                        nums1[i] = nextGreater[j];
                        break;
                    }
                }
            }
            return nums1;
        }
    }

