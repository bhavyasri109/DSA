class Robot{
    int w,h,x,y,d,p;
    String[] s={"East","North","West","South"};
    int[][] m={{1,0},{0,1},{-1,0},{0,-1}};
    public Robot(int width,int height){
        w=width;
        h=height;
        x=0;
        y=0;
        d=0;
        p=2*(width+height-2);
    }
    public void step(int n){
        n=n%p;
        if(n==0)n=p;
        while(n>0){
            int nx=x+m[d][0];
            int ny=y+m[d][1];
            if(nx<0||nx>=w||ny<0||ny>=h){
                d=(d+1)%4;
                continue;
            }
            x=nx;
            y=ny;
            n--;
        }
    }
    public int[] getPos(){
        return new int[]{x,y};
    }
    public String getDir(){
        return s[d];
    }
}