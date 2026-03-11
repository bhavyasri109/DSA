class Solution {
    private void find(int index,int a[],int t,List<List<Integer>> ans,List<Integer> ds){
        if(t==0){
            ans.add(new ArrayList<>(ds));
            return ;
        }
        for(int i=index;i<a.length;i++){
            if(i>index&&a[i]==a[i-1]){
                continue;
            }
            if(a[i]>t){
                break;
            }
            ds.add(a[i]);
            find(i+1,a,t-a[i],ans,ds);
            ds.remove(ds.size()-1);
        }
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        find(0,candidates,target,ans,new ArrayList());
        return ans;
    }
}