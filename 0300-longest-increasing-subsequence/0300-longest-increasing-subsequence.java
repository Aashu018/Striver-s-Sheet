class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        
        for(int[] num : dp){
            Arrays.fill(num,-1);
        }
        
        return find(0,-1,n,nums,dp);
    }
    
    public int find(int idx,int prev,int n, int arr[],int[][] dp){
        if(idx==n){
            return 0;
        }
        
        if(dp[idx][prev+1] != -1){
            return dp[idx][prev+1];
        }
        
        int nottake = find(idx+1,prev,n,arr,dp);
        int take = 0;
        
        if(prev == -1 || arr[idx]>arr[prev] ){
            take  = 1 + find(idx+1,idx,n,arr,dp);
        }
        
        dp[idx][prev+1] = Math.max(take,nottake);
        
        return dp[idx][prev+1];
    }
}