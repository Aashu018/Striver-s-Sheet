class Solution {
    public int jump(int[] nums) {
        if(nums.length<=1) return 0;
        int end = 0;
        int count = 0;
        int far = 0;
        for(int i=0;i<nums.length;i++){
            far = Math.max(far,i+nums[i]);
            
            if(far >= nums.length-1){
                ++count;
                break;
            }
            if(i==end){
                end = far;
                ++count;
            }
            
            
        }
        
        return count;
    }
   // public void recursion (int[]nums,int count,int idx)
}