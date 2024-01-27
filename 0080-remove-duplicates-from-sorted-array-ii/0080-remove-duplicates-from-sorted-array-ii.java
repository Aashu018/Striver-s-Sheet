class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        int i=0;
       while(i<nums.length){
            int ele = nums[i];
            if(nums[i] == ele){
                nums[idx] = nums[i];
                idx++;
                i++;
            }
            if(i>=nums.length){
                break;
            }
            if(nums[i] == ele){
                nums[idx] = nums[i];
                idx++;
                i++;
            }
            while(i<nums.length && nums[i]==ele ){
                i++;
            }
        }
        
        return idx;
    }
}