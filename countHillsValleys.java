class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            int prev = i - 1;
            int next = i + 1;

            // Skip duplicates on the left
            while (prev >= 0 && nums[prev] == nums[i]) {
                prev--;
            }

            // Skip duplicates on the right
            while (next < nums.length && nums[next] == nums[i]) {
                next++;
            }

            // If either neighbor is invalid, skip
            if (prev < 0 || next >= nums.length) continue;

            // Check for hill or valley
            if ((nums[i] > nums[prev] && nums[i] > nums[next]) ||
                (nums[i] < nums[prev] && nums[i] < nums[next])) {
                count++;
            }
        }

        return count;
    }
}
