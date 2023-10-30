class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder tb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#' ){
                if(sb.length()>0)
                sb.deleteCharAt(sb.length()-1);
                
                continue;
            }
            sb.append(s.charAt(i));
        }
         for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#' ){
                if(tb.length()>0)
                tb.deleteCharAt(tb.length()-1);
                continue;
            }
            tb.append(t.charAt(i));
        }
       // System.out.println(tb);
        String s1 = sb.toString();
        String s2 = tb.toString();
        if(s1.equals(s2)){
        return true;
        }
        return false;
    }
}