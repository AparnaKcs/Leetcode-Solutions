// Last updated: 8/20/2026, 4:07:00 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int res = nums.length;
4        
5        for (int i = 0; i < nums.length; i++) {
6            res += i - nums[i];
7        }
8        
9        return res;       
10    }
11}