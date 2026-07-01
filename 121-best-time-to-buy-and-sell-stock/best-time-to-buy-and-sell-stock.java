class Solution {
    public int maxProfit(int[] prices) {
        int diff=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){

            if(prices[i]<diff){
                diff=prices[i];
            }else if(prices[i]-diff>profit){
                profit=prices[i]-diff;
            }
        }
        return profit;
    }
}