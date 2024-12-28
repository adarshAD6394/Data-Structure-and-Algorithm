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
        Stack<Character> s = new Stack<>();
        StringBuilder result = new StringBuilder();
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        for (int i = 0; i <= index; i++) {
            s.push(word.charAt(i));
        }
        while (!s.isEmpty()) {
            result.append(s.pop());
        }
        result.append(word.substring(index + 1));
        return result.toString();
    }
}
