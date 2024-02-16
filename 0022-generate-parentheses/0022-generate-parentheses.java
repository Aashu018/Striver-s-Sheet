class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        generate(res,0,0,"",n);
        return res;
    }
    private void generate(ArrayList<String> res,int left, int right,String s,int n){
        if(s.length()== n*2){
            res.add(s);
            return;
        }
        
        if(left<n){
            generate(res,left+1,right,s+"(",n);
        }
        if(right<left){
            generate(res,left,right+1,s+")",n);
        }
    }
}