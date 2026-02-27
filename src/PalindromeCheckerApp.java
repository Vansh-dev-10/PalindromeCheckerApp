public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1 - Welcome Message
        System.out.println("===========================================");
        System.out.println("        WELCOME TO PALINDROME CHECKER       ");
        System.out.println("===========================================");
        System.out.println("Application Name    : Palindrome Checker App");
        System.out.println("Application Version : 1.0");
        System.out.println("===========================================\n");

        // UC2 - Hardcoded Palindrome Check (Two Pointer Method)
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

        // UC3 - Palindrome Check Using String Reverse
        String input = "level";
        String reversed = "";

        // Reverse string using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed strings
        if (input.equals(reversed)) {
            System.out.println("UC3: The word \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("UC3: The word \"" + input + "\" is NOT a Palindrome.");
        }
    }
}