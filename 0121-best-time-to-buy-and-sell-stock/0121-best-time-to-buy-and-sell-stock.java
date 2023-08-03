class Solution {
    public int maxProfit(int[] prices) {
        int minsofar = prices[0];
        int maxprofit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minsofar){
                minsofar= prices[i];
            }
              int curr = prices[i]- minsofar;
              if(curr>maxprofit){
                 maxprofit = curr;
              }

        }
        return maxprofit;
    }
}