/*You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build*/

import java.util.Scanner;
public class arrangecoins{
public int arrangeCoins(int n) {
    int res=0;
   int stairs =1;
   while(n>0 && n>=stairs){           
           n=n-stairs;
           res++;
           stairs++;           
   }
return res;
}
  public static void main(String[] args)
  {
      Scanner io=new Scanner(System.in);
      int n =io.nextInt();
      arrangecoins s=new arrangecoins();
      System.out.println(s.arrangeCoins(n));
      io.close();
  }
}