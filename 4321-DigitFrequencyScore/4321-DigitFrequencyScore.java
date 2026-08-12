// Last updated: 8/12/2026, 11:04:09 AM
class Solution {
    public int digitFrequencyScore(int n) {
        int s=0;
        while(n>0){
            int d = n%10;
            s+=d;
            n/=10;
        }
        return s;
    }
}