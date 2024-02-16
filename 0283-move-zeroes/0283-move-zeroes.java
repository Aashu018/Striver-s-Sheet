class Solution {
    public void moveZeroes(int[] nums) {
//          int count = 0;
        
//         for(int i:nums){
//             if(i==0)count++;
//         }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                swap(i,j,nums);
                j++;
            }
        }
    }
    private void swap(int i, int j, int nums[]){
       int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}