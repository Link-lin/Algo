public class BuyAndSell{

    // Default dp solution
    public static int maxProfit(int[] prices) {
        int length = prices.length;
        char[][] profit = new char[length][length];
        int maxprofit = -99;
        int money = 0;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(i>j) continue;
                else if(i == j){ 
                    profit[i][j] = 0;
                }
                else if(i == 0){
                    money = prices[j] - prices[i];
                    profit[i][j] = (char) money;
                    if(money >maxprofit) maxprofit = money;
                }
                else if(j == length - 1){
                    money = prices[j] - prices[i];
                    profit[i][j] = (char) money;
                    if(money >maxprofit) maxprofit = money;
                }
                else{
                    money = Math.max(profit[i][j-1] + prices[j]-prices[j-1], profit[j][j]);
                    profit[i][j] = (char) money;
                    if(money >maxprofit) maxprofit = money;
                }
            }
        }
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                System.out.print(profit[i][j] + ",");
            }
            System.out.println();
        }
        System.out.print(maxprofit);
        return maxprofit;
    }

     // Kadane's algorithm
     public static int maxProfit1(int[] prices){
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }

    // 1ms solution
    public int maxProfit2(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
                continue;
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int[] pr ={7,6,4,3,1};
        maxProfit(pr);
    }
}