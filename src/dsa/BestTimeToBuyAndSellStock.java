package dsa;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int arr[] = {1,5,7,3,8,10};

        int result;
        result = maxProfit(arr);
        System.out.println(result);
        }

        public static int maxProfit(int[] prices) {

            int minPrice, currentPrice, profit;
            minPrice = prices[0];
            int maxProfit=0;

            for(int i=0; i<prices.length; i++) {

                currentPrice = prices[i];
                if(currentPrice < minPrice) {

                    minPrice = currentPrice;
                }
                else {
                    profit = currentPrice - minPrice;
                    maxProfit = (maxProfit < profit) ? profit : maxProfit;
                }
            }
            return maxProfit;
        }
}


