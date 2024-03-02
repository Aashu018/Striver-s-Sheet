class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] pro = new int[nums.length];
        int zeros = 0;
        int product = 1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeros++;
            }else{
                product *= nums[i];

            }
        }
        
        for(int i=0;i <nums.length;i++){
            if(zeros==0){
              pro[i] = product/nums[i];
            }
            
            else if(zeros ==1){
                if(nums[i]==0){
                    pro[i] = product;
                }else pro[i] = 0;
            }else {
                pro[i] = 0;
            }
        }
        
        
        return pro;
    }
}