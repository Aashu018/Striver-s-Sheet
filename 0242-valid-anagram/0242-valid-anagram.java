class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
      //  System.out.println(hm);
        
        for(int i=0;i<s.length();i++){
            char ch = t.charAt(i);
            
            if(!hm.containsKey(ch) || hm.get(ch) == 0)
               return false;
           
            else 
               hm.put(ch,hm.get(ch)-1);
        
    }
       
            return true;
        
    }
}