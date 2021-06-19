class Solution {
    public int maxProfit(int[] prices) {
        
        int sum=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            
            min=Math.min(prices[i],min);
            sum=Math.max(sum,prices[i]-min);
            
        }
        return sum;
    }
}