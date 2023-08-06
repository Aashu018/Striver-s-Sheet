class Solution {
    public int uniquePaths(int m, int n) {
        
        int N = m-1 +n - 1;
        int r = m-1;
        double res = 1;
        
        for(int i=1;i<=r;i++){
            res = res* (N-r+i);
            res = res/i;
        }
        return (int)res;
            
    }
}