class Pair{
    int node;
    int par;
    
    Pair(int n, int p){
        node = n;
        par = p;
    }
}

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
     List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] prereq : prerequisites) {
            adj.get(prereq[0]).add(prereq[1]);
        }

        int[] visited = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                if (hasCycle(i, adj, visited)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean hasCycle(int node, List<List<Integer>> adj, int[] visited) {
        visited[node] = 1; // Mark as being visited

        for (int neighbor : adj.get(node)) {
            if (visited[neighbor] == 1) {
                return true; // Detected a cycle
            } else if (visited[neighbor] == 0 && hasCycle(neighbor, adj, visited)) {
                return true;
            }
        }

        visited[node] = 2; // Mark as visited and processed
        return false;
    }

}