import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ================= UC1 =================
        // Application Entry & Welcome Message
        System.out.println("===========================================");
        System.out.println("        WELCOME TO PALINDROME CHECKER       ");
        System.out.println("===========================================");
        System.out.println("Application Name    : Palindrome Checker App");
        System.out.println("Application Version : 1.0");
        System.out.println("===========================================\n");


        // ================= UC2 =================
        // Hardcoded Palindrome Check (Two Pointer Method)
        String word = "madam";
        boolean isPalindrome = true;

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("UC2: The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("UC2: The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println();


        // ================= UC3 =================
        // Palindrome Check Using String Reverse
        String input = "level";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println("UC3: The word \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("UC3: The word \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println();


        // ================= UC4 =================
        // Character Array Based Palindrome Check
        String input2 = "radar";
        char[] chars = input2.toCharArray();

        int left = 0;
        int right = chars.length - 1;
        boolean isPalindromeCharArray = true;

        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindromeCharArray = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindromeCharArray) {
            System.out.println("UC4: The word \"" + input2 + "\" is a Palindrome.");
        } else {
            System.out.println("UC4: The word \"" + input2 + "\" is NOT a Palindrome.");
        }

        System.out.println();


        // ================= UC5 =================
        // Stack-Based Palindrome Checker
        String input3 = "noon";
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input3.length(); i++) {
            stack.push(input3.charAt(i));
        }

        String reversedUsingStack = "";

        // Pop characters from stack
        while (!stack.isEmpty()) {
            reversedUsingStack = reversedUsingStack + stack.pop();
        }

        if (input3.equals(reversedUsingStack)) {
            System.out.println("UC5: The word \"" + input3 + "\" is a Palindrome.");
        } else {
            System.out.println("UC5: The word \"" + input3 + "\" is NOT a Palindrome.");
        }

        System.out.println();


        // ================= UC6 =================
        // Queue + Stack Based Palindrome Check
        String input4 = "refer";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();

        // Enqueue & Push characters
        for (int i = 0; i < input4.length(); i++) {
            char ch = input4.charAt(i);
            queue.add(ch);     // FIFO
            stack2.push(ch);  // LIFO
        }

        boolean isPalindromeQueueStack = true;

        // Compare dequeue and pop
        while (!queue.isEmpty()) {
            if (queue.remove() != stack2.pop()) {
                isPalindromeQueueStack = false;
                break;
            }
        }

        if (isPalindromeQueueStack) {
            System.out.println("UC6: The word \"" + input4 + "\" is a Palindrome.");
        } else {
            System.out.println("UC6: The word \"" + input4 + "\" is NOT a Palindrome.");
        }
    }
}