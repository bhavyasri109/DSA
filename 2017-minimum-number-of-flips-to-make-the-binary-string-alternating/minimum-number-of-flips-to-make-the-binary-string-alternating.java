class Solution{
    public int minFlips(String s){
        int n=s.length();
        String t=s+s;
        int f1=0,f2=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(c!=(i%2==0?'0':'1')) f1++;
            if(c!=(i%2==0?'1':'0')) f2++;
            if(i>=n){
                char old=t.charAt(i-n);
                if(old!=((i-n)%2==0?'0':'1')) f1--;
                if(old!=((i-n)%2==0?'1':'0')) f2--;
            }
            if(i>=n-1)
                ans=Math.min(ans,Math.min(f1,f2));
        }
        return ans;
    }
}