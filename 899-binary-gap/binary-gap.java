class Solution {
    public int binaryGap(int n) {
        int lastposition=-1;
        int maxdist=0;
        String bits=Integer.toBinaryString(n);
        for(int i=0;i<bits.length();i++){
            if(bits.charAt(i)=='1'){
                if(lastposition!=-1){
                    int dist=i-lastposition;
                    maxdist=Math.max(maxdist,dist);
                }
                lastposition=i;
            }
        }
        return maxdist;
    }
}