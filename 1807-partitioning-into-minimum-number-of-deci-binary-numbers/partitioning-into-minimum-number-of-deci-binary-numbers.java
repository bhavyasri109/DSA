class Solution {
    public int minPartitions(String n) {
        int maxx=0;
        for(int i=0;i<n.length();i++){
            int digit=n.charAt(i)-'0';
            maxx=Math.max(digit,maxx);
        }
        return maxx;
    }
}