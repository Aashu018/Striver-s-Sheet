class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        
        int len = word1.length() + word2.length();
        int f1 = 0;
        int f2 = 0;
        while(f1 < word1.length() && f2< word2.length()){
        
          ans += word1.charAt(f1);
          f1++;
            
          ans += word2.charAt(f2);
          f2++;
            
        }
        while(f1<word1.length()){
             ans += word1.charAt(f1);
             f1++;
        }
         while(f2<word2.length()){
             ans += word2.charAt(f2);
             f2++;
        }
        
        return ans;
    }
}