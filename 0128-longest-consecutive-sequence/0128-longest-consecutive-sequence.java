class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums); 
        if(nums.length == 0){
            return 0;
        }
        int min = nums[0];
        int count = 1;
        int max = 1;
        for(int i=1;i<nums.length;i++){
             if(nums[i]==min+1){
                 count++;
                 min = nums[i];
             }else if(nums[i]>min+1){
                 min = nums[i];
                 count = 1;
             }
            max = Math.max(max,count);

         }
         //max = count;
        return max;
    }
}