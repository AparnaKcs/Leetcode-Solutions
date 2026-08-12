// Last updated: 8/12/2026, 11:04:14 AM
class Solution {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        int ans=0;
        for(int i = 0; i < s.length()-1; i++) {
        if(s.charAt(i) != s.charAt(i+1)){
        ans++;
           }
        }
        return ans;
    }
}