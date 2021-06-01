/* A super ugly number is a positive integer whose prime factors are in the array primes.
Given an integer n and an array of integers primes, return the nth super ugly number.
The nth super ugly number is guaranteed to fit in a 32-bit signed integer.*/

import java.util.Scanner;

public class superuglyno{
public int nthSuperUglyNumber(int n, int[] primes) {
    int[] count = new int[primes.length];
   int[] dp = new int[n];
   dp[0] = 1;
   
   for (int i = 1; i < n; i++) {
       int currUglyNumber = Integer.MAX_VALUE;
       
       for (int j = 0; j < primes.length; j++) {
           currUglyNumber = Math.min (currUglyNumber, dp[count[j]] * primes[j]);
       }
       
       for (int j = 0; j < count.length; j++) {
           if (currUglyNumber == dp[count[j]] * primes[j]) {
               ++count[j];
           }
       }
       
       dp[i] = currUglyNumber;
   }
   
   return dp[n - 1];
}
  public static void main(String[] args) {
      Scanner io=new Scanner(System.in);
      int n=io.nextInt();
      int size=io.nextInt();
      int[] arr=new int[size];
      for(int i=0;i<size;i++)
      {
          arr[i]=io.nextInt();

      }
      superuglyno s=new superuglyno();
      System.out.println(s.nthSuperUglyNumber(n,arr));
      io.close();
  }
}