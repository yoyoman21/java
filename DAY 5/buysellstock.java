/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/

import java.util.*;
public class buysellstock {
    public int maxProfit(int[] prices) {
        int profit=0;
         for(int i=0;i<prices.length;i++)
         {
             for(int j=i+1;j<prices.length;j++)
             {
             int a=prices[j]-prices[i];
             if(a>profit)
             {
               profit=0;
               profit=profit+a;  
             }
             }
         }
         return profit;
     }
     public static void main(String[] args)
     {
         Scanner io=new Scanner(System.in);
         int size=io.nextInt();
         int[] arr=new int[size];
         for(int i=0;i<size;i++)
         {
             arr[i]=io.nextInt();
         }
         buysellstock s=new buysellstock();
         System.out.println(s.maxProfit(arr));
         io.close();
        }
}
