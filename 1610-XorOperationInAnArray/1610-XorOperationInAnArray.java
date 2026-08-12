// Last updated: 8/12/2026, 11:05:35 AM
class Solution {
    public int xorOperation(int n, int start) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans ^ (start + 2 * i);
        }
        return ans;
    }
}