/*Given an array of integers arr, and three integers a, b and c. You need to find the number of good triplets.

A triplet (arr[i], arr[j], arr[k]) is good if the following conditions are true:

0 <= i < j < k < arr.length
|arr[i] - arr[j]| <= a
|arr[j] - arr[k]| <= b
|arr[i] - arr[k]| <= c
*/

import java.util.Scanner;
public class countgoodtriplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int x=arr[i]-arr[j];
                if(Math.abs(x)<=a)
                {
                  for(int k=j+1;k<arr.length;k++)
                 {
                    int y=arr[j]-arr[k];
                    int z=arr[i]-arr[k];
                      if(Math.abs(y)<=b && Math.abs(z)<=c)
                      {
                          count++;
                      }
                 }
               }
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int a=io.nextInt();
        int b=io.nextInt();
        int c=io.nextInt();
        int size=io.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=io.nextInt();
        }
        countgoodtriplets s=new countgoodtriplets();
        System.out.println(s.countGoodTriplets(arr, a, b, c));
        io.close();
    }
}
