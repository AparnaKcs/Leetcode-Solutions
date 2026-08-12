// Last updated: 8/12/2026, 11:04:11 AM
public class Solution {
    public String triangleType(int[] nums) {
        if (nums[0] == nums[1] && nums[1] == nums[2])
            return "equilateral";
        else if ((nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2])
                 && nums[0] + nums[1] > nums[2]
                 && nums[1] + nums[2] > nums[0]
                 && nums[0] + nums[2] > nums[1])
            return "isosceles";
        else if (nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2]
                 && nums[0] + nums[1] > nums[2]
                 && nums[1] + nums[2] > nums[0]
                 && nums[0] + nums[2] > nums[1])
            return "scalene";
        return "none";
    }
}