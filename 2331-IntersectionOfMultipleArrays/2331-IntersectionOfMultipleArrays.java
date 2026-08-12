// Last updated: 8/12/2026, 11:05:09 AM

class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();
        int[] count  = new int[1001];
        for(int[] arr : nums){
            for(int i : arr){
                count[i]++;
            }
        }
       for(int i=0;i<count.length;i++){
           if(count[i]==nums.length){
               ans.add(i);
           }
       }
        return ans;
    }
}