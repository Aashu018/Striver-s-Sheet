class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int len = nums.length;
        int pre = 1;
        int[] left = new int[len];
        int[] right = new int[len];
        
        left[0] = 1;
        for(int i=1;i<len;i++){
            pre *= nums[i-1];
            left[i] = pre;
        }
        
        right[len-1] = 1;
        pre = 1;
        for(int i=len-2;i>=0;i--){
            pre *= nums[i+1];
            right[i] = pre;
        }
        
        for(int i=0;i<len;i++){
            ans[i] = left[i]*right[i];
        }
        
        return ans;
    }
}