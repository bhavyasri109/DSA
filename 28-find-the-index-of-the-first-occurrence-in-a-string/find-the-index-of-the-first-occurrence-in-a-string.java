class Solution {
    public int strStr(String haystack, String needle) {
        int j=needle.length();
        for(int i=0;j<=haystack.length();i++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
            j++;
        }
        return -1;
    }
}