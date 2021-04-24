/*Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.

A subarray is a contiguous subsequence of the array.

Return the sum of all odd-length subarrays of arr.*/

import java.util.Scanner;
public class sumofoddlength
{
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
         int sum=0;
      for(int i=0;i<n;i++)
      {
        sum = sum+(((i+1)*(n-i)+1)/2)*arr[i];
       }
       return sum;
      }
      public static void main(String[] args){
      
         Scanner io=new Scanner(System.in);
         int size=io.nextInt();
         int[] arr=new int[size];
         for(int i=0;i<size;i++)
         {
             arr[i]=io.nextInt();
         }
         sumofoddlength s=new sumofoddlength();
         System.out.println(s.sumOddLengthSubarrays(arr));
         io.close();
        
      }
}