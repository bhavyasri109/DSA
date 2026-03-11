class Solution {
    private void find(int index,int a[],int t,List<List<Integer>> ans,List<Integer> ds){
        if(index==a.length){
            if(t==0){
                ans.add(new ArrayList<>(ds));
            }
            return ;
        }
        if(a[index]<=t){
            ds.add(a[index]);
            find(index,a,t-a[index],ans,ds);
            ds.remove(ds.size()-1);
        }
        find(index+1,a,t,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        find(0,candidates,target,ans,new ArrayList());
        return ans;
    }
}