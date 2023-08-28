class Solution {
    public int findPeakElement(int[] nums) {
         int n = nums.length;
        
        if(n == 1 ) return 0;

        if(nums[n - 1] > nums[n - 2]) return n - 1;
        
        int lo = 0;
        int hi = nums.length-1;
        while(lo<=hi){
            int mid = (lo+hi)>>1;
            
          int minus = mid==0? Integer.MIN_VALUE: nums[mid-1];
          int plus = mid == n-1?Integer.MIN_VALUE: nums[mid+1];
        
            if(nums[mid]>minus && nums[mid]>plus){
                return mid;
            }
            else if(nums[mid]>minus){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return lo;
    }
}