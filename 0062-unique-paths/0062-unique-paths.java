class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
         for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = recursion(0,0,m,n,dp);
        if(n==1 && m==1){
            return ans;
        }
        return dp[0][0];
    }
    public int recursion(int i,int j,int m , int n,int[][] dp ){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>=m || j>=n){
            return 0 ;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
       
       return dp[i][j] = recursion(i+1,j,m,n,dp) + recursion(i,j+1,m,n,dp);
  
    }
    
    
}