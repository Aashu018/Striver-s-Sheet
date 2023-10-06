class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int curr = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
               count = Math.max(count,curr);
                curr = 0;
            }else  curr++;
        }
         count = Math.max(count,curr);
        return count;
    }
}