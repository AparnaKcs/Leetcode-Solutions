// Last updated: 8/12/2026, 11:07:44 AM
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String rev="";
        s=s.replaceAll("[^a-z0-9]","");
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            return true;
        }
        return false;
    }
}