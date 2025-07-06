class Solution {
    public String reverseWords(String s) {
        // Trim leading/trailing spaces and split by one or more spaces using regex
        String[] words = s.trim().split("\\s+");

        // Reverse the array of words
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }

        return sb.toString();
    }
}
