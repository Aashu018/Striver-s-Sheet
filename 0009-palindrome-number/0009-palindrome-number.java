class Solution {
    public boolean isPalindrome(int x) {
       String str = "" + x;
       int len = str.length();
       for(int i=0;i<len/2;i++){
           int j = len-i-1;
           if(str.charAt(i)!=str.charAt(j)){
               return false;
           }
       } 
       return true;
    }
}