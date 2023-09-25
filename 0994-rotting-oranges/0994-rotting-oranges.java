class Pair{
    int row;
    int col;
    int tm;
    
    Pair(int r, int c, int t){
        row = r;
        col = c;
        tm = t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0)return 0;
        int n = grid.length;
        int m = grid[0].length;
        
        Queue<Pair> q  = new LinkedList<>();
        int[][] vis = new int[n][m];
        
        int cntfresh = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }else{
                    vis[i][j]=0;
                }
                 if(grid[i][j]==1){
                    cntfresh++;
                }
            }
        }
        if(cntfresh == 0) return 0;
        int tm = 0;
        int dx[] = {0, 0, 1, -1};
        int dy[] = {1, -1, 0, 0};
        int cnt = 0;
        
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().tm;
            tm = Math.max(tm,t);
            q.remove();
            
            
         for(int i=0;i<4;i++){
                int x = r + dx[i];
                int y = c + dy[i];
               
             if(x>=0 && y>=0 && x<n && y<m && grid[x][y]==1 && vis[x][y]==0){
                 q.add(new Pair(x,y,t+1));
                 vis[x][y]=2;
                 cnt++;
             }
          
          }
            
        }
        if(cnt != cntfresh)return -1;
        return tm;
        
    }
}