class Solution {
    public int countPrimeSetBits(int left, int right) {
        int pc=0;
        for(int i=left;i<=right;i++){
            int setbits=Integer.bitCount(i);
            if(isprime(setbits)){
                pc++;
            }
        } 
        return pc;      
    }
    public static boolean isprime(int n){
        if(n<2) return false;
        int flag=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}