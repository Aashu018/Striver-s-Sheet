class Solution {
    public int findDuplicate(int[] nums) {
//         int i =1;
//        while(nums[0]!= nums[nums[0]]){
//           swap(nums,nums[0],0); 
//        }
//         return nums[0];
//     }
    
//     public void swap(int[] arr,int x, int y){
//         int temp = arr[x];
//         arr[x] = arr[y];
//         arr[y]  = temp;
//     }
        // Slow and fast pointer approach
        int slow = nums[0];
        int fast = nums[0];
        
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        
        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
}
}