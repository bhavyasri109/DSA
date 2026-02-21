class Solution {
    public int countPrimeSetBits(int left, int right) {
        int pc=0;
        for(int i=left;i<=right;i++){
            int onec=0;
            int n=i;
            while(n>=1){
                int x=n%2;
                if(x==1){
                    onec++;
                }
                n=n/2;
            }
            if(onec<2)continue;
            int flag=0;
            for(int j=2;j*j<=onec;j++){
                if(onec%j==0){
                  flag=1;
                  break;  
                }
            }
            if(flag==0){
                pc++;
            }
        }
        return pc;
    }
}