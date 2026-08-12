// Last updated: 8/12/2026, 11:04:12 AM
class Solution {
    public int minOperations(int[] nums, int k) {
       int sum=0;
       for(int num:nums){
        sum+=num;
       } 
       return sum%k;
    }
}