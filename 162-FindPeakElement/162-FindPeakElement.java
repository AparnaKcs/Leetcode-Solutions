// Last updated: 8/12/2026, 11:07:37 AM
class Solution {
    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] > nums[i + 1]) {
        return i;
    }
}
return nums.length - 1;
    }
}