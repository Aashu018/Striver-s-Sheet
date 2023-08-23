class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = mergeSortedArrays(nums1,nums2);
        
        int l = merged.length;
        // for(int i=0;i<l;i++){
        //     System.out.println(merged[i]);
        // }
        if(l%2 == 1){
            return (double)merged[l/2];
        }
        l = l/2;
        double sum = (double)(merged[l]+merged[l-1])/2;
        return sum;
        
    }
        public int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] result = new int[len1 + len2];
        
        int i = 0, j = 0, k = 0;
        
        // Compare elements from both arrays and merge them in the result array
        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        
        // Copy remaining elements from arr1, if any
        while (i < len1) {
            result[k++] = arr1[i++];
        }
        
        // Copy remaining elements from arr2, if any
        while (j < len2) {
            result[k++] = arr2[j++];
        }
        
        return result;
    }
}