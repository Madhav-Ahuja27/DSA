class Solution {
public:
    double myPow(double x, int n) {
        long long N = n;  // Use long long to avoid overflow with INT_MIN
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return power(x, N);
    }

private:
    double power(double x, long long n) {
        if (n == 0) return 1;
        if (n == 1) return x;

        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
};
