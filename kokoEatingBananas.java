class Solution {
    boolean check(int[] piles, int k, int h){
        int count = 0;
        for(int i = 0; i < piles.length; i++){
            if (piles[i] % k == 0) {
                count += piles[i] / k;
            } else {
                count += (piles[i] / k) + 1;
            }
        }
        if(count <= h){
            return true;
        }
        return false;
    }

    int bs(int[] piles, int low, int high, int h){
        if(low > high){
            return low;
        }

        int mid = low + (high - low) / 2;
        if(check(piles, mid, h) == true){
            return bs(piles, low, mid - 1, h);
        } else {
            return bs(piles, mid + 1, high, h);
        }
    }

    public int minEatingSpeed(int[] piles, int h) {
        int m = piles[0];
        for(int i = 0; i < piles.length; i++){
            m = (piles[i] > m) ? piles[i] : m;
        }
        return bs(piles, 1, m, h);
    }
}
