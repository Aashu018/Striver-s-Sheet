// class Solution {
//     public int findMaxValueOfEquation(int[][] points, int k) {
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
//     }
// }
class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int maxM=Integer.MIN_VALUE;
        int lastKnownGreater=1;
        int i=0;
        while(i<points.length)
        {
            if(lastKnownGreater<=i)
            {
                lastKnownGreater=i+1;
            }
            for(int j=lastKnownGreater;j<points.length;j++)
            {
                if(points[j][0]>(k+points[i][0]))
                {
                    break;
                }
                int temp=points[i][1]+points[j][1]+Math.abs(points[j][0]-points[i][0]);
                if(temp>maxM)
                {
                    maxM=temp;
                    lastKnownGreater=j;
                }
            }
            i++;
        }
        return maxM;
    }
}