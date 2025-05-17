class Solution {
    public boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters and convert to lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isPalindromeRecursive(s, 0, s.length() - 1);
    }

    private boolean isPalindromeRecursive(String s, int left, int right) {
        // Base case: if the pointers cross, it's a palindrome
        if (left >= right) return true;

        // Check characters at current positions
        if (s.charAt(left) != s.charAt(right)) return false;

        // Recursive step
        return isPalindromeRecursive(s, left + 1, right - 1);
    }
}
