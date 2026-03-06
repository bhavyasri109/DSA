class Solution {
    public boolean checkOnesSegment(String s) {
        int c=0;
        int c1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') {
                c1++;
            }
            else{
                if(c1>=1){
                    c++;
                } 
                c1=0;
            }
        }
        if(c1>=1) c++;
        return c==1;
    }
}