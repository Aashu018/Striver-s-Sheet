class Solution {
    public int minMoves(int[] nums) {
        //Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for(int i:nums){
            if(i<min)
                min = i;
        }
        int moves = 0;
        
        for(int i=0;i<nums.length;i++){
           moves += nums[i]-min;
        }
        
        return moves;
    }
}