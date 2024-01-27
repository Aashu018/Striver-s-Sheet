class Solution {
    public boolean isPalindrome(String s) {
       
        int i=0,j=s.length()-1;
        
        while(i<j){
            char st = s.charAt(i);
            char ed = s.charAt(j);
            
            if(!Character.isLetterOrDigit(st)){
                i++;
            }else if(!Character.isLetterOrDigit(ed)){
                j--;
            }else{
                if(Character.toLowerCase(st) != Character.toLowerCase(ed)) {
                    return false;
                }else{
                    i++;
                    j--;
                }
            }
         
        }
        return true;
    }
}