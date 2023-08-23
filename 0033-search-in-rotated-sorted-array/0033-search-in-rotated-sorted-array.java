class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int idx = minidx(nums,n);
        System.out.println(idx);
        
        int left = bs(nums, 0,idx-1,target);
        int right = bs(nums,idx,n-1,target);
        if(left == -1 && right == -1){
            return -1;
        }
        if(left != -1){
            return left;
        }
        return right;
        
    }
    public int minidx(int[] nums,int n){
        int start = 0;
        int end = nums.length-1;
        
        while(start<= end){
              if (nums[start] <= nums[end]) {
                return start;  // Array is not rotated
            }
            int mid = start + (end-start)/2;
            int prev = (mid + n -1)%n;
            int next = (mid+1)%n;
            
            if(nums[mid]<=nums[next]  && nums[mid]<= nums[prev]){
                return mid;
            }
            else if(nums[start]<=nums[mid]){
                start = mid+1;
            }else if(nums[mid]<=nums[end]){
                end = mid-1;
            }
        }
        return -1;
    }
    public int bs(int[] arr, int lo, int hi,int target){
        while(lo<=hi){
            int mid = (lo+hi)>>1;
            
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                lo = mid + 1;
            }else{
                hi = mid-1;
            }
        }
        return -1;
    }
}