// Last updated: 8/12/2026, 11:08:27 AM
class Solution {
    public double myPow(double x, int n) {

        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1;

        while (power > 0) {

            if (power % 2 == 1) {
                result = result * x;
            }

            x = x * x;
            power = power / 2;
        }

        return result;
    }
}