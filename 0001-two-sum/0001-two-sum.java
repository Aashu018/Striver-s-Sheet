class Solution {
    public int[] twoSum(int[] nums, int target) {
      // Create a HashMap to store numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate the complement needed to reach the target
            
            // Check if the complement exists in the HashMap
            if (map.containsKey(complement)) {
                // If found, return the indices of both numbers that sum up to the target
                return new int[] { map.get(complement), i };
            }
            
            // Store the current number and its index in the HashMap
            map.put(nums[i], i);
        }
        
     return new int[0];
    }
} 