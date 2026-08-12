// Last updated: 8/12/2026, 11:07:34 AM
class Solution {
    public String convertToTitle(int columnNumber) {

        String result = "";

        while (columnNumber > 0) {

            int rem = (columnNumber - 1) % 26;

            result = (char)('A' + rem) + result;

            columnNumber = (columnNumber - 1) / 26;
        }

        return result;
    }
}