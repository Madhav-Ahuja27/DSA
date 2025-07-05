import java.util.HashMap;


class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            mp.put(temp, mp.getOrDefault(temp, 0) + 1); // ✅ fixed line
        }

        Pair<Integer, Integer> ans = new Pair<>(-1, -1);

        // Find the element with max frequency
        for (int ele : mp.keySet()) {
            if (mp.get(ele) > ans.getValue()) { // ✅ use getValue() instead of .second
                ans = new Pair<>(ele, mp.get(ele)); // reassign new Pair
            }
        }

        return ans.getKey(); // ✅ use getKey() instead of .first
    }
}
