package Arrays;

public class BuySellStock{
    public static void main(String[]args){
        int [] prices ={7,1,5,3,6,4};
        maxProfit(prices);
        maxProfit2(prices);

    }

    public static void maxProfit(int[]nums){
        int buyStock = nums[0];
        int sellStock = nums[1];
        for(int i=1;i<nums.length;i++){
            buyStock = Math.min(nums[i],buyStock);
            sellStock = Math.max(nums[i],sellStock);
        }
        System.out.print((sellStock-buyStock));
    }

    public static void maxProfit2(int[]nums){
        int buyStock = Integer.MAX_VALUE;
        int mProfit = 0;
        for(int i=0;i<nums.length;i++){
            if(buyStock < nums[i]){
                int profit = nums[i] - buyStock;
                mProfit = Math.max(profit,mProfit);
            } else{
                buyStock = nums[i];
            }
        }
        System.out.print((mProfit));
    }
}
/*
Formula for maxProfit
buyprice = Min(stockPrice)
maxProfit =0
*/