class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> ans = new HashSet<>();
        comb(0,target,candidates,ans,new ArrayList<>());
        List<List<Integer>> sol = new ArrayList<>(ans);
        return sol;
        
    }

    private void comb(int idx, int target, int[] candidates,Set<List<Integer>> ans,List<Integer> ds){
        //if(candidates.length==idx){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
           return ;
         }

    //  }
           
       for(int i=idx;i<candidates.length;i++){
            if (i > idx && candidates[i] == candidates[i - 1]) continue;
            if(candidates[i]>target)  break;
        
           ds.add(candidates[i]);
           comb(i+1,target-candidates[i],candidates,ans,ds);
           ds.remove(ds.size()-1);
          
       }
    }
}