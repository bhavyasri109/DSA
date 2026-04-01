class Solution{
    public java.util.List<Integer> survivedRobotsHealths(int[]pos,int[]h,String dir){
        int n=pos.length;
        int[][]a=new int[n][4];
        for(int i=0;i<n;i++){
            a[i][0]=pos[i];
            a[i][1]=h[i];
            a[i][2]=dir.charAt(i);
            a[i][3]=i;
        }
        java.util.Arrays.sort(a,(x,y)->x[0]-y[0]);
        java.util.Stack<int[]>st=new java.util.Stack<>();
        for(int i=0;i<n;i++){
            int[]cur=a[i];
            if(cur[2]=='R'){
                st.push(cur);
            }else{
                while(!st.isEmpty()&&st.peek()[2]=='R'&&cur[1]>0){
                    if(st.peek()[1]<cur[1]){
                        cur[1]--;
                        st.pop();
                    }else if(st.peek()[1]>cur[1]){
                        st.peek()[1]--;
                        cur[1]=0;
                    }else{
                        st.pop();
                        cur[1]=0;
                    }
                }
                if(cur[1]>0)st.push(cur);
            }
        }
        int[][]res=new int[st.size()][2];
        int i=0;
        while(!st.isEmpty()){
            int[]t=st.pop();
            res[i][0]=t[3];
            res[i][1]=t[1];
            i++;
        }
        java.util.Arrays.sort(res,(x,y)->x[0]-y[0]);
        java.util.List<Integer>ans=new java.util.ArrayList<>();
        for(int j=0;j<res.length;j++)ans.add(res[j][1]);
        return ans;
    }
}