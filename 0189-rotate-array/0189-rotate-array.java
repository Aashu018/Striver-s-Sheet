class Solution {
    public void rotate(int[] nums, int k) {
         k = k % nums.length;
        int len = nums.length;
//         if(len==0){
//             return;
//         }
        
        reverse(0,len-k-1,nums);
        reverse(len-k,len-1,nums);
        reverse(0,len-1,nums);
      // k %= nums.length;
        // int n = nums.length;
        // reverseNum(nums,0,n-1);
        // reverseNum(nums,0,k-1);
        // reverseNum(nums,k,n-1);
    }
    
    public void reverse(int start, int end,int[] arr){
        int i=start;
        int len = end;
      while(i<len){
          int temp = arr[i];
          arr[i] = arr[len];
          arr[len] = temp;
          
          i++;
          len--;
      }
    }
}
  /// swap 0 - 3
  