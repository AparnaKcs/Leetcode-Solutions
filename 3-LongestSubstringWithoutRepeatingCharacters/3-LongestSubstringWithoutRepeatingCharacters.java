// Last updated: 8/12/2026, 11:10:18 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            String str = "";

            for (int j = i; j < s.length(); j++) {

                if (str.indexOf(s.charAt(j)) != -1) {
                    break;
                }

                str += s.charAt(j);

                if (str.length() > max) {
                    max = str.length();
                }
            }
        }

        return max;
    }
}