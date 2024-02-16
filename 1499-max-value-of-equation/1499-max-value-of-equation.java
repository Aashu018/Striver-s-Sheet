class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
//         int n = points.length;
//         int m = points[0].length;
//         int maxOutput = Integer.MIN_VALUE;
//         for(int i=1;i<n;i++){
         
//             if(points[i][0]-points[i-1][0]==k){
                
//                 int eqn = points[i][1]+points[i-1][1]+ Math.abs(points[i][0]-points[i-1][0]);
//                  System.out.println(eqn);
//                 if(eqn>maxOutput){
//                     maxOutput = eqn;
//                 }
//             }
//              else if(points[i][0]-points[i-1][0]<k){
                 
//              }
//         }
        
//         return maxOutput;
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> (b[1] - b[0]) - (a[1] - a[0]));

        int max = Integer.MIN_VALUE;

        for (int[] point : points) {
            while (!maxHeap.isEmpty() && point[0] - maxHeap.peek()[0] > k) {
                maxHeap.poll();
            }

            if (!maxHeap.isEmpty()) {
                int[] top = maxHeap.peek();
                int result = top[1] - top[0] + point[1] + point[0];
                max = Math.max(max, result);
            }

            maxHeap.offer(point);
        }

        return max;
    }
}