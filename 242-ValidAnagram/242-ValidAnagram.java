// Last updated: 8/12/2026, 11:07:06 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        char a[]= s.toCharArray();
        char b[]= t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
        

    }
}