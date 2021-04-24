/*The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n)*/

import java.util.Scanner;
public class fibonaccino {
    public int fib(int n) {
        if(n <= 1)return n;
        {
   
       int last = 1;
       int secondLast = 0;
       
       for(int i = 2; i <= n; i++)
       {
          int sum = last + secondLast;
          secondLast = last;
           last = sum;
       }
       return last;
   }
     
   }
   public static void main(String[] args) {
       Scanner io=new Scanner(System.in);
       int n=io.nextInt();
       fibonaccino s=new fibonaccino();
       System.out.println(s.fib(n));
       io.close();
   }
}
