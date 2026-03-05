class Solution {
    public int minOperations(String s) {
        int n=s.length();
        int c=0;
        int j=0;
        for(char ch:s.toCharArray()) {
            if(ch-'0'==j) {
                c++;
            }
            j^=1;
        }
        return Math.min(c,n-c);
    }
}