package Arrays;

import java.util.Scanner;

public class BuyandSellStock {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int maxprofit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            }
            int profit = prices[i] - minprice;

            if(profit > maxprofit){
                maxprofit = profit;
            }
    }
    return maxprofit;
}

        void main(){
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of array");
                int n = sc.nextInt();
                System.out.println("Enter the elements of array");
                int[] arr = new int[n];
                for (int i = 0; i <n; i++) {
                    arr[i] = sc.nextInt();
                }
                int p = maxProfit(arr);
            System.out.println(p);
            }
        }