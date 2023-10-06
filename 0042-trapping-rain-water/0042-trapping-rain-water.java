class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        
        prefix[0]=height[0];
        for(int i=1;i<n;i++){
            if(height[i]<prefix[i-1]){
               prefix[i]=prefix[i-1];
            }else{
                prefix[i]=height[i];
            }
            System.out.print(prefix[i] + " ");
             
        }
        System.out.println();
        suffix[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            if(suffix[i+1]>height[i]){
                suffix[i] = suffix[i+1];
            }else{
                suffix[i]=height[i];
            }
             System.out.print(suffix[i] + " ");
        }
        int water = 0;
        for(int i=0;i<n;i++){
            water += Math.min(suffix[i],prefix[i])-height[i];
        }
        return water;
    }
}