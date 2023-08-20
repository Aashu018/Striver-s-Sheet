class Solution {
    public String reverseWords(String s) {
//         Stack<String> st = new Stack<>();
//         s += ' ';
//         String str = "";
        
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i) == ' '){
//                 st.add(str);
//                 str = "";
//             }else{
//                 str += s.charAt(i);
//             }
//         }
        
//         String ans = "";
        
//         while(st.size()!=1){
//             ans += st.pop() + ' ';
//         }
//         ans += st.pop();

//         int start = 0;
//         int end = ans.length() - 1;
        
//         while (start <= end && ans.charAt(start) == ' ') {
//             start++;
//         }
        
//         while (end >= start && ans.charAt(end) == ' ') {
//             end--;
//         }
        
//         return ans.substring(start, end + 1);
        
        int left = 0;
        int right = s.length()-1;
        
        String temp = "";
       String ans = "";
        
        while(left <= right){
            char ch = s.charAt(left);
            if(ch != ' '){
                temp += ch;
            }else if(ch == ' '){
              if(!ans.equals("")){
                  ans = temp + " " + ans;
              }  else{
                  ans = temp;
              }
                temp = "";
            }
            left++;
        }
        
        if(!temp.equals("")){
            if(!ans.equals("")){
                ans = temp + " " + ans;
            }else{
                ans = temp;
            }
            temp = "";
        }
        
        left = 0;
        while(true){
            char c = ans.charAt(left);
            if(c == ' '){
                left++;
            }else{
                break;
            }
        }
        String sol = "";
        sol += ans.charAt(left);
        for(int i=left+1;i<ans.length();i++){
            char c = ans.charAt(i);
            char prev = ans.charAt(i-1);
            if(prev == ' ' && c ==' '){
                
            }else{
                sol += ans.charAt(i);
            }
        }
        return sol;
    }
    
}