class Solution {
    public int longestConsecutive(int[] nums) {
//         Arrays.sort(nums); 
        if(nums.length == 0){ 
            return 0;
        }
//         int min = nums[0];
//         int count = 1;
//         int max = 1;
//         for(int i=1;i<nums.length;i++){
//              if(nums[i]==min+1){
//                  count++;
//                  min = nums[i];
//              }else if(nums[i]>min+1){
//                  min = nums[i];
//                  count = 1;
//              }
//             max = Math.max(max,count);

//          }
//          //max = count;
//         return max;
        int longest = 1;
        Set<Integer> hs = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        
        for(int item : hs){
            
            if(!hs.contains(item-1)){
                int cnt = 1;
                int x = item;
                while(hs.contains(x+1)){
                    cnt++;
                    x++;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
}