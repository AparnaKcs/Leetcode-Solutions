// Last updated: 8/12/2026, 11:05:11 AM
class Solution {
    public int findFinalValue(int[] nums, int original) {

        while (true) {
            boolean found = false;

            for (int num : nums) {
                if (num == original) {
                    original *= 2;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return original;
            }
        }
    }
}