class Solution {
    public int maxProfit(int[] prices) { 
        int max = 0;
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int p : prices){
            if(p < min){
                min = p;
            }
            profit = p - min;
            if(profit > max){
                max = profit;
            }
        }
    return max;
    }
}