// Last updated: 8/12/2026, 11:06:13 AM
import java.util.*;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}