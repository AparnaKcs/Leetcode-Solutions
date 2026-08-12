// Last updated: 8/12/2026, 11:04:52 AM
class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int num : nums) {
            elementSum += num;
            int temp = num;
            while (temp != 0) {
                digitSum += temp % 10;
                temp /= 10;
            }
        }

        return Math.abs(elementSum - digitSum);
    }
}