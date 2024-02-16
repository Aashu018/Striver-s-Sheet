class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
           hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        
        int[] output  = new int[k];
        
       PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> hm.get(a)-hm.get(b));
        
        for(int n: hm.keySet()){
            pq.add(n);
            
            if(pq.size()>k){
                pq.poll();
            }
        }
        for(int i=0;i<k;i++){
            output[i] = pq.poll();
        }
        
        return output;
    }
}