class Solution {
    public int minMaxDifference(int num) {
        String str = Integer.toString(num);

        // Build max value by replacing the first digit that's not 9 with 9
        char toReplaceMax = ' ';
        for (char c : str.toCharArray()) {
            if (c != '9') {
                toReplaceMax = c;
                break;
            }
        }

        String maxStr = (toReplaceMax == ' ') ? str : str.replace(toReplaceMax, '9');

        // Build min value by replacing the first digit that's not 1 or 0 (for first digit)
        char toReplaceMin = ' ';
        for (char c : str.toCharArray()) {
            if (c != '0') {
                toReplaceMin = c;
                break;
            }
        }

        String minStr = (toReplaceMin == ' ') ? str : str.replace(toReplaceMin, '0');

        int max = Integer.parseInt(maxStr);
        int min = Integer.parseInt(minStr);

        return max - min;
    }
}
