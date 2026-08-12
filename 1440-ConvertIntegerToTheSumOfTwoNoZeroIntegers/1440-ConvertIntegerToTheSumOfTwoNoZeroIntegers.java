// Last updated: 8/12/2026, 11:05:52 AM
class Solution {
    public int[] getNoZeroIntegers(int n) {
      for(int i=1;i<n;i++){
        int j=n-i;
        if(!String.valueOf(i).contains("0")&& !String.valueOf(j).contains("0")){
            return new int[]{i,j};
        }
      }  
    
    return new int[0];
}
}