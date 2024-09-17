Time Limit Exceeded
class Solution {
    public int maxProfit(int[] prices) {

        int max = 0;
        for(int i = 0 ; i < prices.length; i++  ){
            for(int j = i+1 ; j < prices.length ; j++){
                int k = prices[j] - prices[i];
                if(k > max ){
                    max = k;
                }
            }
        }
        return max;
    }
}

