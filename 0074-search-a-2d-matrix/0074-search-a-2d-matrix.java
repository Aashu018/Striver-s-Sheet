class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length-1;
        for(int i=0;i<matrix.length;i++){
            if(target<=matrix[i][n]){
                for(int j=0;j<matrix[0].length;j++){
                    if(target==matrix[i][j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}