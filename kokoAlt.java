class Solution {
    boolean check(int[] piles, int k, long h) {
        long count = 0;
        for (int pile : piles) {
            count += (pile + k - 1L) / k;
        }
        return count <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(piles, mid, h)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
