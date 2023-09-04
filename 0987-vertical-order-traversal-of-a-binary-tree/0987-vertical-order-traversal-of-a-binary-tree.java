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

class Tuple {
    TreeNode node;
    int row;
    int col;
    public Tuple(TreeNode _node, int _row, int _col) {
        node = _node;
        row = _row;
        col = _col;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
       Map<Integer, Map<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        
        Queue<Tuple> q = new LinkedList<Tuple>();
        q.offer(new Tuple(root,0,0));
        
        while(!q.isEmpty()){
            Tuple it = q.poll();
            TreeNode temp = it.node;
            int row = it.row;
            int col = it.col;
            
            if(!map.containsKey(row)){
                map.put(row,new TreeMap<>());
            }
            if(!map.get(row).containsKey(col)){
                map.get(row).put(col,new PriorityQueue<>());
            }
            map.get(row).get(col).offer(temp.val);
            
            if(temp.left!= null){
                q.add(new Tuple(temp.left,row-1,col+1));
            }
            
            if(temp.right != null){
                q.add(new Tuple(temp.right,row+1,col+1));
            }
            

            
        }
        
       List<List<Integer>> res = new ArrayList<>();
        for(Map<Integer,PriorityQueue<Integer>> ys : map.values()){
            res.add(new ArrayList<>());
            
            for(PriorityQueue<Integer> nodes: ys.values()){
                while(!nodes.isEmpty()){
                    res.get(res.size()-1).add(nodes.poll());
                }
            }
        }
        
        return res;
        
        
        
    }
}