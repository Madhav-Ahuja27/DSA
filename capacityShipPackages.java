class Solution {
    boolean check(int[] weights, int mid, int days) {
        int currentLoad = 0;
        int requiredDays = 1;

        for (int w : weights) {
            if (w > mid) return false;

            if (currentLoad + w > mid) {
                requiredDays++;
                currentLoad = 0;
            }
            currentLoad += w;
        }

        return requiredDays <= days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt(); // min possible capacity
        int high = Arrays.stream(weights).sum();           // max possible capacity

        return bs(weights, days, low, high);
    }

    int bs(int[] weights, int days, int low, int high) {
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (check(weights, mid, days)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
