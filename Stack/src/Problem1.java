import java.util.Stack;

public class Problem1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(35);
        stack.push(36);
        stack.push(37);
        stack.push(38);
        stack.push(39);
        for (int i = 0; i <= 5; i++) {
            System.out.print(stack.pop()+",");
        }

    }
}
