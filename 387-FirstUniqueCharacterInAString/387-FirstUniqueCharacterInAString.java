// Last updated: 8/12/2026, 11:06:38 AM
class Solution {
    public int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {

            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }

        return -1;
    }
}