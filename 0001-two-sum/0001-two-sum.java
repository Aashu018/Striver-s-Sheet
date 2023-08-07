class Solution {
    public int[] twoSum(int[] nums, int target) {
       // List<Integer> arr = new  ArrayList<>();
        int[] ans = new int[2];
       HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            ans[0] = i;
            int need = target - nums[i];
            if(hm.containsKey(need)){
               int j=  hm.get(need);
                ans[1] = j;
                return ans;
            }
            hm.put(nums[i],i);
        }
        return ans;
    }
}