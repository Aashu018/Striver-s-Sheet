class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
           hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        
        int[] output  = new int[k];
        
       PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->            b.getValue()-a.getValue());
        
        for(Map.Entry entry: hm.entrySet()){
            pq.add(entry);
        }
        for(int i=0;i<k;i++){
            output[i] = pq.poll().getKey();
        }
        
        return output;
    }
}