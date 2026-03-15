class Fancy{
    long mod=1000000007;
    long m=1;
    long a=0;
    ArrayList<Long> l=new ArrayList<>();
    public Fancy(){
    }
    public void append(int v){
        long x=(v-a+mod)%mod;
        x=(x*inv(m))%mod;
        l.add(x);
    }
    public void addAll(int i){
        a=(a+i)%mod;
    }
    public void multAll(int k){
        m=(m*k)%mod;
        a=(a*k)%mod;
    }
    public int getIndex(int i){
        if(i>=l.size())return-1;
        long x=l.get(i);
        long r=(x*m%mod+a)%mod;
        return(int)r;
    }
    long inv(long x){
        return pow(x,mod-2);
    }
    long pow(long b,long p){
        long r=1;
        while(p>0){
            if((p&1)==1)r=(r*b)%mod;
            b=(b*b)%mod;
            p>>=1;
        }
        return r;
    }
}