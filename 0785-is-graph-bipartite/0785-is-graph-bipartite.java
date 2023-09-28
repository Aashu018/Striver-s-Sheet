class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        for(int i=0;i<graph.length;i++) color[i]=-1;
        
        for(int i=0;i<graph.length;i++){
            if(color[i] == -1){
                if(check(i,graph.length,graph,color)==false){
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean check(int node,int V, int[][] graph, int[] color){
        Queue<Integer> q = new LinkedList <>();
        q.add(node);
        color[node] = 0;
        
        while(!q.isEmpty()){
            int nod = q.peek();
            q.remove();
            
            for(int i : graph[nod]){
                if(color[i]==-1){
                    color[i]= 1 - color[nod];
                    q.add(i);
                } else if(color[i]==color[nod]){
                    return false;
                    
                }
            }
        }
        return true;
    }
}