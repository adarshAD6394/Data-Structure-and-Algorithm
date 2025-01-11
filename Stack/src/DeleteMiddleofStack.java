import java.io.*;
import java.util.*;
public class DeleteMiddleofStack {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();
            while (t-- > 0) {
                String temp[] = sc.nextLine().trim().split(" ");
                Stack<Integer> myStack = new Stack<>();
                int n = temp.length;
                // adding elements to the stack
                for (int i = 0; i < n; i++) {
                    int x = Integer.parseInt(temp[i]);
                    myStack.push(x);
                }
                Solution obj = new Solution();
                obj.deleteMid(myStack);

                while (!myStack.isEmpty()) {
                    System.out.print(myStack.peek() + " ");
                    myStack.pop();
                }
                System.out.println();

                System.out.println("~");
            }
        }
    }
// } Driver Code Ends


// User function Template for Java

    class Solution {
        // Function to delete middle element of a stack.
        public void deleteMid(Stack<Integer> s) {
            // code here
            Stack<Integer> t = new Stack<>();
            int size = s.size()/2;
            for(int i = 0;i<size;i++){
                t.push(s.pop());
            }
            s.pop();
            while(!t.isEmpty()){
                s.push(t.pop());
            }
        }
    }


