// Last updated: 8/12/2026, 11:04:32 AM
class Solution {
    public int differenceOfSums(int n, int m) {
        int c=0,c1=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                c+=i;
            }
            else{
                c1+=i;
            }
        }
            return c1-c;
        }
    
}