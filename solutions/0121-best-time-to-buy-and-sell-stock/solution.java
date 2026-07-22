class Solution {
    public int maxProfit(int[] prices) {
      int buy = prices[0],profit = 0;
      for(int current:prices){
       if(current<buy){
        buy = current;
       }
       profit = Math.max(profit,current-buy);
      }
      return profit;
    }
}
