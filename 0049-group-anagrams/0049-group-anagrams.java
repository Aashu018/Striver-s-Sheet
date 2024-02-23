class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        //List<List<String>> ans = new ArrayList<>();
        
        for(String st : strs){
            char[] arr = st.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            
            if(!hm.containsKey(sorted)){
                hm.put(sorted, new ArrayList<>());
            }
            
            hm.get(sorted).add(st);
        }
        
        return new ArrayList<>(hm.values());
    }
}