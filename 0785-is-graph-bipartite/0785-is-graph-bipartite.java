class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        for(int i=0;i<graph.length;i++) color[i]=-1;
        
        for(int i=0;i<graph.length;i++){
            if(color[i] == -1){
                if(check(i,0,graph,color)==false){
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean check(int node,int col, int[][] graph, int[] color){
        color[node] = col;
        
        for(int it : graph[node]){
            if(color[it]==-1){
                if(check(it,1-col,graph,color)==false)return false;
                
            }
            else if(color[it]==col)return false;
        }
        
            
        return true;
    }
}