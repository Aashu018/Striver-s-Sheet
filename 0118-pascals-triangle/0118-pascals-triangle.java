class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(gencol(i));
        }
        return ans;
    }
    public List<Integer> gencol(int col){
        int  ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(ans);
        for(int i=1;i<col;i++){
            ans = ans*(col-i);
            ans = ans/i;
            ansRow.add(ans);
        }
        return ansRow;
    }
}