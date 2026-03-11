class Solution {
    private void find(int index,int[] a,List<List<Integer>> ans,List<Integer> sub){
        if(index==a.length){
            ans.add(new ArrayList<>(sub));
            return;
        }
        sub.add(a[index]);
        find(index+1,a,ans,sub);
        sub.remove(sub.size()-1);
        find(index+1,a,ans,sub);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        find(0,nums,ans,sub);
        return ans;   
    }
}