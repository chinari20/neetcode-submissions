class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int curr = prices[0];
        for(int i:prices){
            max = Math.max(max,i-curr);
            curr=Math.min(i,curr);
        }
        return max;
    }
}
