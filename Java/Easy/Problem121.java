class Problem121 {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;

        int maxProfit = 0, minStockPrice = prices[0];
        for(int i = 1; i<prices.length; i++){
            minStockPrice = Math.min(minStockPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-minStockPrice);
        }
        return maxProfit;
    }
}
