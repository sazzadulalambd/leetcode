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




class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        // int minPrice = Integer.MAX_VALUE;
        int max = 0;

        for(int price : prices){
            if(price < min){
                min = price;
            }

            int profit = price - min;

            if(profit > max ){
                max = profit;
            }

        }
        return max;
    }
}



class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        // int minPrice = Integer.MAX_VALUE;
        int max = 0;

        for(int i = 1; i < prices.length; i++) {
            if(min > prices[i]) {
                min = prices[i];
            }

            int profit = prices[i] - min;

            if(profit > max ){
                max = profit;
            }
        }

        return max;
    }
}
