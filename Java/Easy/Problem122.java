class Problem122 {
    public int maxProfit(int[] prices) {

        // Find every high value immediately following the low value
        int lowStockValue = 0, highStockValue = 0, i = 0;
        int maxProfit = 0, length = prices.length;

        while(i < length-1){

            // Find low stock value
            while(i < length-1 && prices[i] >= prices[i+1]){
                i++;
            }
            // store low Stock price
            lowStockValue = prices[i];

            // find corresponding immediate high stock value
            while(i < length-1 && prices[i+1] >= prices[i]){
                i++;
            }
            // store high Stock price
            highStockValue = prices[i];
            maxProfit += highStockValue - lowStockValue;
        }
        return maxProfit;
    }
}
