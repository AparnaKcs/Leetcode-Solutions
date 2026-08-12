// Last updated: 8/12/2026, 11:05:16 AM
class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            String rev = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                rev = rev + word.charAt(i);
            }

            if (word.equals(rev)) {
                return word;
            }
        }

        return "";
    }
}