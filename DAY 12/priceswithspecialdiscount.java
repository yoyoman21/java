/*Given the array prices where prices[i] is the price of the ith item in a shop. There is a special discount for items in the shop, if you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i], otherwise, you will not receive any discount at all.

Return an array where the ith element is the final price you will pay for the ith item of the shop considering the special discount.*/

import java.util.Scanner;
public class priceswithspecialdiscount {
    public static int[] finalPrices(int[] prices) {
        int[] discount=new int[prices.length];
        
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]<=prices[i])
                {
                   
                    discount[i]=prices[i]-prices[j];
                    break;
                }
               else
               {
                   discount[i]=prices[i];
               }
                
                
            }
            if(i==prices.length-1)
            {
                discount[i]=prices[i];
            }
            
            }
        return discount;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        int[] a=finalPrices(arr);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        io.close();
    }
}
