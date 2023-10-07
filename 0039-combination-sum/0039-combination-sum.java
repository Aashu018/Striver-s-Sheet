class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Subset(0,target,new ArrayList<>(),candidates,ans);
        return ans;
    }
    
    private void Subset(int idx, int target ,List<Integer> ds,int[] candidates,List<List<Integer>> ans){
         if(target==0){
            ans.add(new ArrayList<>(ds));
             return;
         }
         if(idx == candidates.length){
             return;
         }
       
         if(candidates[idx]<= target){
             ds.add(candidates[idx]);
             Subset(idx,target-candidates[idx],ds,candidates,ans);
             ds.remove(ds.size()-1);
         }
        
         Subset(idx+1,target,ds,candidates,ans);

    }
}