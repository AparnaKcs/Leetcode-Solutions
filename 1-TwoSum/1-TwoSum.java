// Last updated: 8/12/2026, 11:10:30 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int a[]=new int[2]; 
        for(int i =0;i<nums.length;i++){
        for(int j=1+i;j<nums.length;j++){
            if(target==nums[i]+nums[j]){
                a[0]=i;
                a[1]=j;
            }
        }
        }
        return a;
    }
}

/*lass Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target==nums[i]+nums[j]){
                    res[0]=i;
                    res[1]=j;
                    break;
                }
            }
        }
        return res;
    }
}*/