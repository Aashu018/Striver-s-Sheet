class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        
       // int slen = 0;
        String ans = "";
        
        for(int g=0;g<len;g++){
            
            for(int i=0,j=g;j<len;i++,j++){
                if(g==0){
                    dp[i][j] = true;
                }else if(g==1){
                    if(s.charAt(i)==s.charAt(j))
                        dp[i][j]=true;
                    else 
                        dp[i][j]=false;
                }else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]==true){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=false;
                    }
                }
                
                if(dp[i][j]){
                    ans = s.substring(i,j+1);
                }
            }
        }
        return ans;
    }
}