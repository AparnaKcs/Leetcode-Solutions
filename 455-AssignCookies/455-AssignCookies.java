// Last updated: 8/12/2026, 11:06:24 AM
import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0; 
        int j = 0; 
        while(i < g.length && j < s.length) {
            if(s[j] >= g[i]) {
                i++;
            }
            j++;
        }
        return i;
    }
}