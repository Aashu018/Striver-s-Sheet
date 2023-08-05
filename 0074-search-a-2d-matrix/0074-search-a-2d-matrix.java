class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int n = matrix[0].length-1;
        // for(int i=0;i<matrix.length;i++){
        //     if(target<=matrix[i][n]){
        //         for(int j=0;j<matrix[0].length;j++){
        //             if(target==matrix[i][j]){
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;
        
        if(matrix.length==0)return false;
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int lo = 0;
        int hi = (m*n)-1;
        
        while(lo<=hi){
            int mid = (lo+(hi-lo)/2);
            
            if(matrix[mid/m][mid%m]==target){
                return true;
            }else if(matrix[mid/m][mid%m]<=target){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return false;
    }
}