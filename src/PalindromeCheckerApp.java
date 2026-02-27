public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1 - Welcome Message
        System.out.println("===========================================");
        System.out.println("        WELCOME TO PALINDROME CHECKER       ");
        System.out.println("===========================================");
        System.out.println("Application Name    : Palindrome Checker App");
        System.out.println("Application Version : 1.0");
        System.out.println("===========================================\n");

        // UC2 - Hardcoded Palindrome Check
        String word = "madam";   // Hardcoded string

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
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}