// Last updated: 8/12/2026, 11:05:19 AM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            String arr[] = sentences[i].split(" ");
            if(arr.length>max)
                max=arr.length;
        }
        return max;
    }
}