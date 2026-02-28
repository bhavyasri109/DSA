class Solution {
    public int concatenatedBinary(int n) {
        long re=0;
        int mod=1_000_000_007;
        for(int i=1;i<=n;i++){
            int bits=Integer.toBinaryString(i).length();
            re=((re<<bits)+i)%mod;
        }
        return (int)re;
    }
}