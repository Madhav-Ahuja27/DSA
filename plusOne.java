class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse from the last digit backwards
        for (int i = n - 1; i >= 0; i--) {
            // If current digit is less than 9, simply add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // Done, no carry needed
            }
            
            // If digit was 9, set it to 0 and continue the loop to handle carry
            digits[i] = 0;
        }
        
        // If loop completes, it means all digits were 9
        // e.g. 999 + 1 → 1000 → need new array of size n+1
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // Rest will be initialized to 0 automatically
        
        return newDigits;
    }
}
