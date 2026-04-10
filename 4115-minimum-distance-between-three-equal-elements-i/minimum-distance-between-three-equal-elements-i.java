class Solution{
    public int minimumDistance(int[] a){
        int n=a.length;
        Map<Integer,List<Integer>> m=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!m.containsKey(a[i]))m.put(a[i],new ArrayList<>());
            m.get(a[i]).add(i);
        }
        int ans=Integer.MAX_VALUE;
        for(int k:m.keySet()){
            List<Integer> l=m.get(k);
            if(l.size()>=3){
                for(int i=0;i<=l.size()-3;i++){
                    ans=Math.min(ans,2*(l.get(i+2)-l.get(i)));
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}