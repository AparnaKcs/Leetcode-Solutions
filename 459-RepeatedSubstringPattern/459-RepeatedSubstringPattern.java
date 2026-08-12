// Last updated: 8/12/2026, 11:06:21 AM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String concatenated = s + s;
        return concatenated.substring(1, concatenated.length() - 1).contains(s);
    }
}