class Solution {
    public int maxProfit(int[] prices) {
        int max =0,min = Integer.MAX_VALUE;
        for(int i =0;i<prices.length;i++){
            if(prices[i]<min) min = prices[i];
            else if(prices[i]>min) max= Math.max(max,prices[i]-min);
        }
        return max;
        
    }
}