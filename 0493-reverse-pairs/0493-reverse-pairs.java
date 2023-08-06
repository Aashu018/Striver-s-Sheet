class Solution {
    public  int reversePairs(int[] nums) {
        int n = nums.length;
       int ans =  mergesort(nums,0,n-1);
        return ans;
    }
    public int mergesort(int[] arr, int lo,int hi){
        int cnt = 0;
        if(lo>=hi){
            return cnt;
        }
        
        int mid = (lo+hi)/2;
        cnt += mergesort(arr,lo,mid);
        cnt += mergesort(arr,mid+1,hi);
        cnt += countPairs(arr,lo,mid,hi);
        
        merge(arr,lo,mid,hi);
        return cnt;
    }
    
    private void merge(int[] arr, int lo,int mid,int hi){
        ArrayList<Integer> temp = new ArrayList<>();
        
        int left = lo;
        int right = mid+1;
        
        while(left<= mid && right<=hi){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        
        while(left<=mid){
            temp.add(arr[left]);
                left++;
        }while(right<=hi){
            temp.add(arr[right]);
                right++;
        }
        
        for(int i=lo;i<=hi;i++){
            arr[i] = temp.get(i-lo);
        }
    }
    
    public int countPairs(int[] arr,int lo,int mid, int hi){
        int right = mid+1;
        int cnt = 0;
        
        for(int i=lo;i<=mid;i++){
            while(right<=hi && (long)arr[i]>2*(long)arr[right]) right++;
            cnt += (right - (mid+1));
        }
        return cnt;
    }
}