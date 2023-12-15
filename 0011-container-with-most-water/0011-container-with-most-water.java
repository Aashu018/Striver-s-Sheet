class Solution {
    public int maxArea(int[] height) {
        // int maxArea = 0;
        // int left = 0, right = height.length - 1;
        // while (left < right) {
        //     int area = Math.min(height[left], height[right]) * (right - left);
        //     maxArea = Math.max(maxArea, area);
        //     if (height[left] < height[right]) {
        //         left++;
        //     } else {
        //         right--;
        //     }
        // }
        // return maxArea;
         int maxArea = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int area = minHeight * (right - left);
            maxArea = Math.max(maxArea, area);
            while (height[left] <= minHeight && left < right) {
                left++;
            }
            while (height[right] <= minHeight && left < right) {
                right--;
            }
        }
        return maxArea;
    }
}