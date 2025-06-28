import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }
            window.add(nums[i]);

            // Maintain the sliding window of size k
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        return false;
    }
}
