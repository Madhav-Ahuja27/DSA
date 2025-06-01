class Solution {
    static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenPositions = (n + 1) / 2; // digits at even index
        long oddPositions = n / 2;        // digits at odd index

        long evenChoices = modPow(5, evenPositions, MOD); // even digits: 0,2,4,6,8
        long oddChoices = modPow(4, oddPositions, MOD);   // prime digits: 2,3,5,7

        return (int)((evenChoices * oddChoices) % MOD);
    }

    // Fast exponentiation: (base^exp) % mod
    private long modPow(long base, long exp, int mod) {
        long result = 1;
        base %= mod;

        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }

        return result;
    }
}
