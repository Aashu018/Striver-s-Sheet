class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i=0,j = matrix[0].length-1;
        
        int m = matrix.length;
        int n  = matrix[0].length;
        
        while(i<m && i>=0 && j>=0 && j<n){
            
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]>target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}