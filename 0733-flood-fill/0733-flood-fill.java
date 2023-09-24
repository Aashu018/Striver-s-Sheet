class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialcol = image[sr][sc];
//         int n = image.length;
//         int m = image[0].length;
//         int[][] ans = new int[n][m];
//         for(int i=0;i<)
            
        int[][] ans = image;
        int delRow[] = {-1, 0, +1, 0};
        int delCol[] = {0, +1, 0, -1};
        
        dfs(sr,sc,ans,image,color,delRow,delCol,initialcol);
        return ans;
    }
    private void dfs(int row,int col,
                    int[][] ans,
                    int[][] image,
                    int newcolor,int delRow[],int delCol[],
                    int initialcol){
        
        ans[row][col] = newcolor;
         int n = image.length;
         int m = image[0].length;
        
        for(int i=0;i<4;i++){
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];
            
             if(nrow>=0 && nrow<n && ncol>=0 && ncol < m && 
            image[nrow][ncol] == initialcol && ans[nrow][ncol] != newcolor) {
                dfs(nrow, ncol, ans, image, newcolor, delRow, delCol, initialcol); 
            }
        }
    }
}