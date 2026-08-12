// Last updated: 8/12/2026, 11:05:58 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n =nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}


