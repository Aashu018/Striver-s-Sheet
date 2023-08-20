class Solution {
    public String reverseWords(String s) {
        s = s.trim() + " ";
        String ans = "";
        String word = "";
        int fg = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                fg = 0;
                word += ch;
            }else if(fg==0) {
                fg=1;
                ans = word + " "+ ans;
                word = "";
            }
        }
        ans = ans.trim();
        return ans;
    }
}