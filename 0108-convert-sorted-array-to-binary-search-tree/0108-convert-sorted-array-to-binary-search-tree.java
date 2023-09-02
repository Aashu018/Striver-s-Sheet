/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        return tree(nums, 0, n-1);
    }
    
    public TreeNode tree(int[] nums, int left, int right){
        
     
            int mid = (left+right)>>1;
           if(left > right)
               return null;
            
            TreeNode root = new TreeNode(nums[mid]);
          
            root.left = tree(nums,left , mid-1);
            root.right = tree(nums,mid+1, right);
        
            return root;
    }
}