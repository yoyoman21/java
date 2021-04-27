/*Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.

The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.*/

import java.util.*;
public class distancevalue
{
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        for(int i=0;i<arr1.length;i++)
        {
             int flag=1;
            for(int j=0;j<arr2.length;j++)
            {
                
                if(Math.abs(arr1[i]-arr2[j])<=d)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
          {
           c++; 
          }
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner io=new Scanner(System.in);
        int m=io.nextInt();
        int[] arr1=new int[m];
        int n=io.nextInt();
        int[] arr2=new int[n];
        for(int i=0;i<m;i++)
        {
            arr1[i]=io.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            arr2[j]=io.nextInt();
        }
        int d=io.nextInt();
        distancevalue s=new distancevalue();
        System.out.println(s.findTheDistanceValue(arr1, arr2, d));
        io.close();
    }
}