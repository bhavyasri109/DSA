class Solution{
    public List<Integer> solveQueries(int[] a,int[] q){
        int n=a.length;
        Map<Integer,List<Integer>> m=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!m.containsKey(a[i]))m.put(a[i],new ArrayList<>());
            m.get(a[i]).add(i);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<q.length;i++){
            int idx=q[i];
            int v=a[idx];
            List<Integer> l=m.get(v);
            if(l.size()==1){
                ans.add(-1);
                continue;
            }
            int pos=Collections.binarySearch(l,idx);
            int left=l.get((pos-1+l.size())%l.size());
            int right=l.get((pos+1)%l.size());
            int d1=Math.abs(idx-left);
            int d2=Math.abs(idx-right);
            int res=Math.min(Math.min(d1,n-d1),Math.min(d2,n-d2));
            ans.add(res);
        }
        return ans;
    }
}