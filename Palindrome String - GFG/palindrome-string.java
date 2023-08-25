//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        int l = S.length();
       // l = l/2;
        
        for(int i=0;i<l/2;i++){
            char start = S.charAt(i);
            char end = S.charAt(l-i-1);
            
            if(start != end){
                return 0;
            }
        }
        return 1;
    }
};