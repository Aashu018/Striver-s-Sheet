class Solution {
    public int[][] merge(int[][] intervals) {
        
       List<int[]> ans = new ArrayList<>();
        
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        
        for(int i=0;i<intervals.length;i++){
            if(ans.size()==0 || ans.get(ans.size()-1)[1]<intervals[i][0]){
                ans.add(intervals[i]);
            }else{
                
                ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1],intervals[i][1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}