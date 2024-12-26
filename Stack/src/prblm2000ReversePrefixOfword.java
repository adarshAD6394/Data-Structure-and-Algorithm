import java.util.Stack;
import java.util.Scanner;

public class prblm2000ReversePrefixOfword {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the word
        System.out.print("Enter the word: ");
        String word = scanner.nextLine();

        // Input the character
        System.out.print("Enter the character: ");
        char ch = scanner.next().charAt(0);

        // Call the function and display the result
        String result = reversePrefix(word, ch);
        System.out.println("Resulting string: " + result);

        // Close the scanner
        scanner.close();

    }
    public static String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        int index = 0;
        while (index < word.length()) {
            stack.push(word.charAt(index));
            // Found ch
            if (word.charAt(index) == ch) {
                // Add characters through ch to the result in reverse order
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                index++;
                // Add the rest of the characters to result
                while (index < word.length()) {
                    result.append(word.charAt(index));
                    index++;
                }
                return result.toString();
            }
            index++;
        }

        return word;
    }
}
