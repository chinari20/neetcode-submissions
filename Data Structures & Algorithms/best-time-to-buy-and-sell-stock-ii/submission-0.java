class Solution {
    public int maxProfit(int[] prices) {
     //   int min=prices[0];
        int p = 0;
        int tp=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                p+=prices[i]-prices[i-1];
                tp = Math.max(tp,p);
            }
        }
        return p;
    }
}