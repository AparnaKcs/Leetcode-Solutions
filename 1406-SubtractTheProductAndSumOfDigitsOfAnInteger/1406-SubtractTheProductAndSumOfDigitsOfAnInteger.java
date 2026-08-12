// Last updated: 8/12/2026, 11:05:55 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int dsum = 0;
        int dproduct = 1;

        while (n > 0) {
            int digit = n % 10;
            dsum += digit;
            dproduct *= digit;
            n = n / 10;
        }

        return dproduct - dsum;
    }
}